package com.fenoreste_alestra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fenoreste_alestra.service.AccountServiceAlestra;
import com.fenoreste_alestra.ws_client_tdd.BalanceQueryResponseDto;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/saicoop")
@CrossOrigin(origins = "*")
@Slf4j
public class AccountControllerSAICoop {

    
	@Autowired
	private AccountServiceAlestra service;
    
    @RequestMapping(value="/getBalanceQuery/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public BalanceQueryResponseDto obtenerSaldo(@PathVariable String idcard) {
    	log.info("Accediento a obtenerLSaldo:"+idcard);
    	return service.getBalance(idcard);
    }
    
    /*
    @RequestMapping(value="/cardLock/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public CardLockResponse bloquearTarjeta(@PathVariable String idcard) {	
       	CardLockResponse cardLock = new CardLockResponse();
       	cardLock.setCode(0);
       	cardLock.setAuthorization("678");
        return cardLock;//  service.cardLock(idcard);
    }
    
    @RequestMapping(value="/temporaryLock/{idcard}/{accion}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public TemporaryLockResponse bloquearTarjetaTemporal(@PathParam("{idcard}") String idcard,@PathParam("accion") String accion) {	
        TemporaryLockResponse cardLock = new TemporaryLockResponse();
       	cardLock.setCode(0);
       	cardLock.setAuthorization("678");
       	cardLock.setDescription("Operacion Exitosa");
        return cardLock;// service.temporaryLock(idcard,accion);
    }
    
    @RequestMapping(value="/loadBalance/{idcard}/{amount}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public LoadBalanceResponse depositarSaldoTarjeta(@PathParam("idcard") String idcard,@PathParam("amount") String amount) {	
       	LoadBalanceResponse load = new LoadBalanceResponse();
       	load.setCode(1);
       	load.setBalance(100.50);
       	load.setAuthorization("2ert566");
       	load.setCurrentBalance(0);
       	load.setDescription("Transaccion Existosa");
        return load;// service.loadBalance(idcard,amount);
    }
    
    @RequestMapping(value="/updateDemographicData", method =RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public UpdateDemographicDataResponse modificarDatosDemograficos(@RequestBody updateDemographicData model) {	  
    	UpdateDemographicDataResponse response = new UpdateDemographicDataResponse();    	
    	response.setCode(1);
    	response.setDate("25-05-2022");
    	response.setDescription("updated");
    	response.setTime("454938");
        return response;//service.updateDemographicDatas(model);
    }
    
    //ROHR621024MNLDRS04
    
    @RequestMapping(value="/lastTransaction/{idcard}/{nmov}/{tmov}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public LastestTransactionsResponse verMovimientosTarjeta(@PathParam("{idcard}") String idcard,@PathParam("nmov") String nmov,@PathParam("tmov")String tmov) {	
       	LastestTransactionsResponse lat = new LastestTransactionsResponse();
       	lat.setCode(1);
       	lat.setDescription("Error en transaccion");       	
       	
        return lat;//service.lastTransaction(idcard, nmov, nmov);
    }
    
    @RequestMapping(value="/stockCardReplacement/{idcard}/{cardReplacement}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public StockCardReplacementResponse reemplazarTarjeta(@PathParam("{idcard}") String idcard,@PathParam("{cardReplacement}") String cardReplacement) {	
       	StockCardReplacementResponse stock = new StockCardReplacementResponse();
       	stock.setCode(0);
       	stock.setAuthorization("43535345");
       	stock.setCurrentTime("5646");
        return stock;// service.stockCardReplacement(idcard, cardReplacement);
    }
    
    @RequestMapping(value="/asignaNip/{idcard}/{passnip}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public AsignaNIPResponse assignaNipTarjeta(@PathParam("{idcard}") String idcard,@PathParam("{passnip}") String passnip) {	
       	  AsignaNIPResponse asigna = new AsignaNIPResponse();
       	  asigna.setCode(0);
       	  asigna.setDescription("Transaccion Exitosa");
    	return asigna;// service.asignaNip(idcard, passnip);
    }
    
    @RequestMapping(value="/cardHolderInformation/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public CardHolderInformationResponse informacionTarjeta(@PathVariable String idcard) {	
       	CardHolderInformationResponse response = new CardHolderInformationResponse();
       	response.setCp("242424");
       	response.setColonia("Colonia");
       	response.setEstado("Estado");
       	response.setTarjeta("453535");
        return response;// service.cardHolderInformation(idcard);
    }
    
    
    //Asignar una cuenta
    @RequestMapping(value="/assignamentAccount", method =RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public AssignmentAccountResponse asignarCuenta(@RequestBody assignamentAccountModel model) {	
       	AssignmentAccountResponse assigna = new AssignmentAccountResponse();
       	assigna.setCLABE("543543534534543");
       	assigna.setCode(0);
        return assigna;//  service.assignamentAccount(model);
    }
    
    
    @RequestMapping(value="/activateCard/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public ActiveCardResponse activarTarjeta(@PathVariable String idcard) {	
       	ActiveCardResponse activate = new ActiveCardResponse();
       	activate.setCode(0);
       	activate.setDescription("Transaccion Exitosa");
       	activate.setAuthorization("564564");
        return activate;// service.activeCard(idcard);
    }    
    
    @RequestMapping(value="/doWithDrawal/{idcard}/{amount}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public DoWithDrawalAccountResponse retirarSaldoTarjeta(@PathParam("{idcard}") String idcard,@PathParam("amount") String amount) {
    	DoWithDrawalAccountResponse dos = new DoWithDrawalAccountResponse();
       	dos.setCode(0);
       	dos.setAuthorization("45345435");
       	dos.setBalance(456.67);
       	dos.setCurrentBalance(34);
       	dos.setDescription("Descripcion");
       	
        return dos;// service.doWithDrawal(idcard, amount);
    }    
    
   
    @RequestMapping(value="/deleteIndividualLimit/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public DeleteIndividualLimitResponse eliminarLimiteTarjeta(@PathVariable String idcard) {	
       	CardLockResponse cardLock = new CardLockResponse();
       	cardLock.setCode(0);
       	cardLock.setAuthorization("678");
        return service.deleteIndividualLimit(idcard);
    }
    
    @RequestMapping(value="/updateIndividualLimit", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public UpdateIndividualLimitsResponse modificarLimiteTarjeta(@RequestBody limitCardModel model) {	
       	CardLockResponse cardLock = new CardLockResponse();
       	cardLock.setCode(0);
       	cardLock.setAuthorization("678");
        return service.updateIndividualLimit(model);
    }
    
    @RequestMapping(value="/saveInformationClient", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public SaveInformationClientResponse guardarInformacionCliente(@RequestBody ClientInfo info) {	
       	CardLockResponse cardLock = new CardLockResponse();
       	cardLock.setCode(0);
       	cardLock.setAuthorization("678");
        return service.saveInformationClientBitMatch(info);
    }
    
   
    */
    
    
    
    




}
