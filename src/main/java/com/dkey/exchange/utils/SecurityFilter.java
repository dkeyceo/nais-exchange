package com.dkey.exchange.utils;

import org.glassfish.jersey.internal.util.Base64;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

@Provider
public class SecurityFilter implements ContainerRequestFilter {
    private static final String AUTHORIZATION_HEADER_KEY = "Authorization";
    private static final String AUTHORIZATION_HEADER_PREFIX = "Basic ";
    private static final String SECURED_URL_PREFIX = "v1";

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        /*
        if(containerRequestContext.getUriInfo().getPath().contains(SECURED_URL_PREFIX)){
            List<String> authHeader = containerRequestContext.getHeaders().get(AUTHORIZATION_HEADER_KEY);
            if(authHeader !=null && authHeader.size() > 0 ){
                String authToken = authHeader.get(0);
                authToken = authToken.replaceFirst(AUTHORIZATION_HEADER_PREFIX,"");
                String decodedString = Base64.decodeAsString(authToken);
                StringTokenizer tokenizer = new StringTokenizer(decodedString,":");
                String username = tokenizer.nextToken();
                String password = tokenizer.nextToken();

                if("NaisExchange".equals(username)&&"PermitPolice2018".equals(password)){
                    return;
                }

            }
            Response unauthorizedStatus = Response.status(Response.Status.UNAUTHORIZED)
                    .entity("User is unauthorized!").build();
            containerRequestContext.abortWith(unauthorizedStatus);
        }*/
    }
}

