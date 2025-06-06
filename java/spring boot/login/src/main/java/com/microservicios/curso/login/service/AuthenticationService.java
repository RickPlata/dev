package com.microservicios.curso.login.service;

import com.microservicios.curso.login.view.Credentials;

public interface AuthenticationService {
    public Integer authentication(Credentials credentials) throws Exception;
}
