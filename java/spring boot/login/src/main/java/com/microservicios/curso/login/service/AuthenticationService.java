package com.microservicios.curso.login.service;

import com.microservicios.curso.login.view.Credentials;
import jakarta.persistence.criteria.CriteriaBuilder;

public interface AuthenticationService {
    public Integer authentication(Credentials credentials);
}
