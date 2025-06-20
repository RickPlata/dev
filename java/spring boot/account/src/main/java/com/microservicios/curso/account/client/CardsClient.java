package com.microservicios.curso.account.client;

import java.util.List;

import com.microservicios.curso.account.model.Card;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class CardsClient {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @CircuitBreaker(name = "cards", fallbackMethod = "fallbackGetCardsByAccountNumber")
    public List<Card> getCardsByAccountNumber(String accountNumber){
    
        return restTemplate
                .getForEntity("http://localhost/api/cards/{accountNumber}", List.class, accountNumber)
                .getBody();
    }

    public List<Card> fallbackGetCardsByAccountNumber(Exception ex){
        log.info("fallback method");
        return null;
    }
}


