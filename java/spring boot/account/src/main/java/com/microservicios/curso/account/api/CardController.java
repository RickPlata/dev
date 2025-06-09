package com.microservicios.curso.account.api;

import com.microservicios.curso.account.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservicios.curso.account.model.Card;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping("/cards/{accountNumber}")
    public List<Card> getCardsByAccountNumber(@PathVariable("accountNumber") String accountNumber){
        return cardService.getCardsByAccountNumber(accountNumber);
    }
}
