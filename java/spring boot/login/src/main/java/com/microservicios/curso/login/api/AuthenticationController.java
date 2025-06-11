package com.microservicios.curso.login.api;

import com.microservicios.curso.login.model.Customer;
import com.microservicios.curso.login.service.AuthenticationService;
import com.microservicios.curso.login.view.Credentials;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(HttpServletResponse response, @RequestBody Credentials credentials){

        return ResponseEntity.ok().header("Authentication", String.valueOf(authenticationService.authentication(credentials))).build();
    }
}
