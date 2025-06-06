package com.microservicios.curso.login.api;

import com.microservicios.curso.login.model.Customer;
import com.microservicios.curso.login.service.AuthenticationService;
import com.microservicios.curso.login.view.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody Credentials credentials) throws Exception{
        if(authenticationService.authentication(credentials) == 0){
            return new ResponseEntity<>(false, HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
