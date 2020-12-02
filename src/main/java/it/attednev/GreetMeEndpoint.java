package it.attednev;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class GreetMeEndpoint {

    @PayloadRoot(namespace = "http://localhost/services/", localPart = "GreetMeRequest")
    @ResponsePayload
    public GreetMeResponse greet(@RequestPayload GreetMeRequest request) {
        GreetMeResponse response = new GreetMeResponse();
        response.setGreeting("Hallo " + request.getName());
        return response;
    }

}
