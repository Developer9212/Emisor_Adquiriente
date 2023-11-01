package com.fenoreste_alestra;

import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.common.ConfigurationConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.fenoreste_alestra.config.ClientKeystorePasswordCallback;
import com.fenoreste_alestra.entity.Tabla;
import com.fenoreste_alestra.entity.TablaPK;
import com.fenoreste_alestra.service.ITablaService;
import com.fenoreste_alestra.service.TablaServiceImpl;
import com.fenoreste_alestra.utilidades.FicheroConexion;
import com.fenoreste_alestra.ws_client_tdd.ActivateCardResponse;
import com.fenoreste_alestra.ws_client_tdd.CardInfo;
import com.fenoreste_alestra.ws_client_tdd.UpdateDemographicData;
import com.fenoreste_alestra.ws_client_tdd.UpdateDemographicData.Cardinfo;
import com.fenoreste_alestra.ws_client_tdd.UpdateDemographicDataResponse;
import com.fenoreste_alestra.ws_client_tddImpl.SiscoopAlternativeEndpoint;

public class ConsumoTest {

	
	public static void main(String[]args) {
		 try {
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	        factory.setServiceClass(SiscoopAlternativeEndpoint.class);
	        //factory.setServiceName(new QName("http://impl.siscoop.endpoint.ws.syc.com/", "SiscoopAlternativeEndpointImplPort"));
	        factory.setAddress("http://192.168.110.85:6969/syc-siscoop/webservice/sagrada-familia/siscoopSecureService/activateCard");
	        factory.getInInterceptors().add(wss4jIn());
	        factory.getOutInterceptors().add(wss4jOut());
	        factory.setUsername("ws_sagrada_familia");
	        factory.setPassword("ws_sagrada_familia");
	         factory.create();
	         SiscoopAlternativeEndpoint client = (SiscoopAlternativeEndpoint) factory.create();
	         UpdateDemographicData data = new UpdateDemographicData();
	         CardInfo card = new CardInfo();
	         card.setName("nahumdfdsf");
	         card.setShortName("");
	         card.setAddress("nuervocscssc dsjfpdsfj");
	         card.setCellPhone("");
	         card.setCity("kkkkkkkkkkkkkk");
	         card.setColony("");
	         card.setEmail("sdfsdfsfds");
	         card.setHomePhone("");
	         data.setPan("5063350100001298");
	         
	         UpdateDemographicDataResponse res =     client.updateDemographicData("5063350100001298", card);
	         System.out.println("Codigo respuesta:"+res.getCodigo()); 
	       
	       
		} catch (Exception e) {
			System.out.println("Error al procesar main:"+e.getMessage());
			e.printStackTrace();
		}
       
	}
		
  
    /* WSS4JInInterceptor para validar firma del servidor */
    public static WSS4JInInterceptor wss4jIn() {
        Map<String, Object> inProps = new HashMap<>();
        inProps.put(ConfigurationConstants.ALLOW_RSA15_KEY_TRANSPORT_ALGORITHM, "true");		
		inProps.put(ConfigurationConstants.ACTION,ConfigurationConstants.ENCRYPTION + " " + ConfigurationConstants.SIGNATURE);
		inProps.put(ConfigurationConstants.DEC_PROP_FILE, new FicheroConexion().getUserHome()+"/emisor-adquiriente/cert-properties/local.properties");//"/home/siscoop/Certs/Ssl/fenoreste.properties");
		inProps.put(ConfigurationConstants.SIG_PROP_FILE, new FicheroConexion().getUserHome()+"/emisor-adquiriente/cert-properties/proveedor.properties");//"/home/siscoop/Certs/Ssl/appcert.properties");
		inProps.put(ConfigurationConstants.PW_CALLBACK_CLASS, ClientKeystorePasswordCallback.class.getName());

        
        return new WSS4JInInterceptor(inProps);	
    }

    public static  WSS4JOutInterceptor wss4jOut(){
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
