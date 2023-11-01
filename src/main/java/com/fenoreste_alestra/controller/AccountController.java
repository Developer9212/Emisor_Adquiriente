package com.fenoreste_alestra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fenoreste_alestra.service.AccountServiceAlestra;
import com.fenoreste_alestra.ws_client_tdd.AsignaNIPResponse;
import com.fenoreste_alestra.ws_client_tdd.AssignmentAccountResponse;
import com.fenoreste_alestra.ws_client_tdd.BalanceQueryResponseDto;
import com.fenoreste_alestra.ws_client_tdd.CardHolderInformationResponse;
import com.fenoreste_alestra.ws_client_tdd.CardInfo;
import com.fenoreste_alestra.ws_client_tdd.CardLockResponse;
import com.fenoreste_alestra.ws_client_tdd.IndividualLimitsDto;
import com.fenoreste_alestra.ws_client_tdd.InfoClientRequest;
import com.fenoreste_alestra.ws_client_tdd.LoadBalanceResponse;
import com.fenoreste_alestra.ws_client_tdd.TemporaryLockResponse;
import com.fenoreste_alestra.ws_client_tdd.UpdateDemographicDataResponse;
import com.fenoreste_alestra.ws_client_tddImpl.Exception;




@RestController
@RequestMapping("/api/cards")
@CrossOrigin(origins = "*")
public class AccountController {

    @Autowired
	private AccountServiceAlestra service;
   
    @RequestMapping(value="/activateCard/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public com.fenoreste_alestra.ws_client_tdd.ActivateCardResponse activarTarjeta(@PathVariable String idcard) throws Exception {	
        return service.activeCard(idcard);
    }
    
    
    @RequestMapping(value="/getBalanceQuery/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public BalanceQueryResponseDto obtenerSaldo(@PathVariable String idcard) {	    	
        return service.getBalance(idcard);
    }
    
    
    @RequestMapping(value="/cardLock/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public CardLockResponse bloquearTarjeta(@PathVariable String idcard) throws Exception {	
        return service.cardLock(idcard);
    }
    
    @RequestMapping(value="/temporaryLock/idtarjeta={idcard}&mov={accion}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public TemporaryLockResponse bloquearTarjetaTemporal(@PathVariable String idcard,@PathVariable int accion) throws Exception {	
       	return service.temporaryLock(idcard,accion);
    }
    
    @RequestMapping(value="/loadBalance/idtarjeta={idcard}&monto={amount}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public LoadBalanceResponse depositarSaldoTarjeta(@PathVariable String idcard,@PathVariable String amount) throws NumberFormatException, Exception {	
       	return service.loadBalance(idcard,amount);
    }
    
    
    @RequestMapping(value="/updateDemographicData/idtarjeta={idcard}", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public UpdateDemographicDataResponse modificarDatosDemograficos(@PathVariable String idcard,@RequestBody CardInfo data) {	  
    	return service.updateDemographicData(idcard,data);
    }
    
    
    @RequestMapping(value="/lastestsTransactions/idtarjeta={idcard}&totalMov={nmov}&tipoMov={tmov}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public com.fenoreste_alestra.ws_client_tdd.GetLastestTransactionsResponse verMovimientosTarjeta(@PathVariable String idcard,@PathVariable int nmov,@PathVariable int tmov) {	
       return service.lastTransaction(idcard, nmov, nmov);
    }
    
    @RequestMapping(value="/stockCardReplacement/idtarjeta={idcard}&reemplazar={cardReplacement}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public com.fenoreste_alestra.ws_client_tdd.StockCardReplacementResponse reemplazarTarjeta(@PathVariable String idcard,@PathVariable String cardReplacement){	
        return service.stockCardReplacement(idcard, cardReplacement);
    }
    
    @RequestMapping(value="/asignaNip/idtarjeta={idcard}&nip={passnip}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public AsignaNIPResponse assignaNipTarjeta(@PathVariable String idcard,@PathVariable String passnip) {	
    	return service.asignaNip(idcard, passnip);
    }
    
    @RequestMapping(value="/cardHolderInformation/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public CardHolderInformationResponse informacionTarjeta(@PathVariable String idcard) {	
       	return service.cardHolderInformation(idcard);
    }
    
    @RequestMapping(value="/assignamentAccount/idtarjeta={pan}", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public AssignmentAccountResponse asignarCuenta(@PathVariable String pan,@RequestBody InfoClientRequest info) {	
       	return service.assignamentAccount(pan,info);
    }
    
    @RequestMapping(value="/doWithDrawal/idtarjeta={idcard}&monto={amount}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public com.fenoreste_alestra.ws_client_tdd.DoWithdrawalAccountResponse retirarSaldoTarjeta(@PathVariable String idcard,@PathVariable String amount) {	
       	return service.doWithDrawal(idcard, amount);
    }    
    
    @RequestMapping(value="/deleteIndividualLimit/idtarjeta={idcard}", method =RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public com.fenoreste_alestra.ws_client_tdd.DeleteIndividualLimitsResponse eliminarLimiteTarjeta(@PathVariable String idcard) {	
       return service.deleteIndividualLimit(idcard);
    }
    
    @RequestMapping(value="/updateIndividualLimit/{idcard}", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public com.fenoreste_alestra.ws_client_tdd.UpdateIndividualLimitsResponse modificarLimiteTarjeta(@PathVariable("idcard")String idcard,@RequestBody IndividualLimitsDto model) {	
       return service.updateIndividualLimit(idcard,model);
    }
    
    @RequestMapping(value="/saveInformationClient", method =RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
   	public com.fenoreste_alestra.ws_client_tdd.SaveInformationClientBitMatchResponse guardarInformacionCliente(@RequestBody InfoClientRequest info) {	
       return service.saveInformationClientBitMatch(info);
    }
    

}
