package com.fenoreste_alestra.config;

import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.wss4j.common.ConfigurationConstants;

import com.fenoreste_alestra.entity.Tabla;
import com.fenoreste_alestra.entity.TablaPK;
import com.fenoreste_alestra.service.ITablaService;
import com.fenoreste_alestra.utilidades.FicheroConexion;
import com.fenoreste_alestra.ws_client_tddImpl.SiscoopAlternativeEndpoint;


@Configuration
//@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class ConfigurationClient {
	
	@Autowired
	private ITablaService tablaService;
	
	
	String idTabla = "emisor_adquiriente";
		
    @Bean("SiscoopAlternativeEndpoint")
	public SiscoopAlternativeEndpoint clienteWS(){
    	TablaPK pk = new TablaPK(idTabla,"url_alestra");
    	Tabla tabla = tablaService.buscarPorId(pk);
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(SiscoopAlternativeEndpoint.class);
        factory.setAddress(tabla.getDato2());//"http://192.168.110.85:6969/syc-siscoop/webservice/sagrada-familia/siscoopSecureService");
        factory.getInInterceptors().add(wss4jIn());
        factory.getOutInterceptors().add(wss4jOut());
        pk.setIdelemento("credenciales");
        tabla = tablaService.buscarPorId(pk);
        factory.setUsername(tabla.getDato1());//"ws_sagrada_familia");
        factory.setPassword(tabla.getDato2());//"ws_sagrada_familia");
        SiscoopAlternativeEndpoint client = (SiscoopAlternativeEndpoint) factory.create();
        
        return client;
    }

    /* WSS4JInInterceptor para validar firma del servidor */
    public WSS4JInInterceptor wss4jIn() {
        Map<String, Object> inProps = new HashMap<>();
        inProps.put(ConfigurationConstants.ALLOW_RSA15_KEY_TRANSPORT_ALGORITHM, "true");		
		inProps.put(ConfigurationConstants.ACTION,ConfigurationConstants.ENCRYPTION + " " + ConfigurationConstants.SIGNATURE);
		inProps.put(ConfigurationConstants.DEC_PROP_FILE, new FicheroConexion().getUserHome()+"/emisor-adquiriente/cert-properties/local.properties");//"/home/siscoop/Certs/Ssl/fenoreste.properties");
		inProps.put(ConfigurationConstants.SIG_PROP_FILE, new FicheroConexion().getUserHome()+"/emisor-adquiriente/cert-properties/proveedor.properties");//"/home/siscoop/Certs/Ssl/appcert.properties");
		inProps.put(ConfigurationConstants.PW_CALLBACK_CLASS, ClientKeystorePasswordCallback.class.getName());

        
        return new WSS4JInInterceptor(inProps);	
    }

    public WSS4JOutInterceptor wss4jOut(){
    	Map<String, Object> outProps = new HashMap<>();
		outProps.put(ConfigurationConstants.ACTION,ConfigurationConstants.ENCRYPTION + " " + ConfigurationConstants.SIGNATURE);
		outProps.put(ConfigurationConstants.USER, "fenoreste");
		outProps.put(ConfigurationConstants.SIGNATURE_USER, "fenoreste");
		outProps.put(ConfigurationConstants.ENCRYPTION_USER, "appcert");														      			
		outProps.put(ConfigurationConstants.ENC_PROP_FILE, new FicheroConexion().getUserHome()+"/emisor-adquiriente/cert-properties/local.properties");//"/home/siscoop/Certs/Ssl/fenoreste.properties");
		outProps.put(ConfigurationConstants.SIG_PROP_FILE, new FicheroConexion().getUserHome()+"/emisor-adquiriente/cert-properties/proveedor.properties");//"/home/siscoop/Certs/Ssl/appcert.properties");
		outProps.put(ConfigurationConstants.ENC_KEY_ID, "DirectReference");
		outProps.put(ConfigurationConstants.SIG_KEY_ID, "DirectReference");
		outProps.put(ConfigurationConstants.PW_CALLBACK_CLASS, ClientKeystorePasswordCallback.class.getName());
		outProps.put(ConfigurationConstants.SIGNATURE_PARTS,"{Element}{http://schemas.xmlsoap.org/soap/envelope/}Body");
		outProps.put(ConfigurationConstants.ENCRYPTION_PARTS,"{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body");
		outProps.put(ConfigurationConstants.ENC_SYM_ALGO, "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");

		return new WSS4JOutInterceptor(outProps);		
    }


	
}
