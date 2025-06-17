package com.microservicios.curso.account.client;

import java.util.List;

import com.microservicios.curso.account.model.Card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CardsClient {

    @Autowired
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    public List<Card> getCardsByAccountNumber(String accountNumber){
    
        return restTemplate
                .getForEntity("http://localhost/api/cards/{accountNumber}", List.class, accountNumber)
                .getBody();
  
    }
}


