package com.fourthelephant;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

public class RestDataManagerImpl {

    public static void main(String[] args) {
        //for localhost testing only
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
                new javax.net.ssl.HostnameVerifier(){
                    public boolean verify(String hostname,
                                          javax.net.ssl.SSLSession sslSession) {
                        if (hostname.equals("localhost")) {
                            return true;
                        }
                        return false;
                    }
                });


        Client client = Client.create(new DefaultClientConfig());
        client.addFilter(new HTTPBasicAuthFilter("ivan", "e2e4"));
        WebResource service = client.resource(UriBuilder.fromUri("https://localhost:8443/restba/service").build());
        String res = service.path("accounts").accept(MediaType.TEXT_HTML).get(String.class);
        System.out.println(res);
    }

}
