package com.java_factory_pattern.service;

import com.java_factory_pattern.model.ApiRequest;
import com.java_factory_pattern.model.ClientRequest;
import org.springframework.http.HttpHeaders;

public abstract class DomainService {

  protected abstract ClientRequest createClientResponse(ApiRequest apiRequest);

  protected abstract void callService(ClientRequest clientRequest, HttpHeaders httpHeaders);

  public void processRequest(ApiRequest apiRequest, HttpHeaders httpHeaders) {

    ClientRequest clientRequest = this.createClientResponse(apiRequest);
    this.callService(clientRequest, httpHeaders);

  }

}
