package com.fenoreste_alestra.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ClientKeystorePasswordCallback implements CallbackHandler{

    
    private static Map<String, String> users;
    
    static {
		users = new HashMap<>();
		users.put("appcert", "fenoreste2023");
        users.put("fenoreste", "fenoreste2023");
    }

    public void handle(Callback[] callbacks) throws IOException,UnsupportedCallbackException {


        for (int i = 0; i < callbacks.length; i++) {

            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
            
            if (pc.getUsage() == WSPasswordCallback.SIGNATURE
                    || pc.getUsage() == WSPasswordCallback.DECRYPT && (users.containsKey(pc.getIdentifier()))) {
                	pc.setPassword(users.get(pc.getIdentifier()));                  
            }

        }

    }

}
