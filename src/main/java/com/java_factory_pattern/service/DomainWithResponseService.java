package com.java_factory_pattern.service;

import com.java_factory_pattern.model.ApiRequest;
import com.java_factory_pattern.model.ClientRequest;
import com.java_factory_pattern.model.ClientResponse;
import org.springframework.http.HttpHeaders;

public abstract class DomainWithResponseService {

  protected abstract ClientRequest createClientRequest(ApiRequest apiRequest);

  protected abstract ClientResponse callService(ClientRequest clientRequest, HttpHeaders httpHeaders);

  public ClientResponse processRequest(ApiRequest apiRequest, HttpHeaders httpHeaders){

    ClientRequest clientRequest = this.createClientRequest(apiRequest);
    return this.callService(clientRequest, httpHeaders);

  }

}
