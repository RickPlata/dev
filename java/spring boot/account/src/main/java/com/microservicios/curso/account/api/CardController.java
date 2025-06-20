package com.microservicios.curso.account.api;

import com.microservicios.curso.account.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservicios.curso.account.model.Card;

import java.util.List;
import java.util.Random;

@Slf4j
@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping("/cards/{accountNumber}")
    public ResponseEntity<List<Card>> getCardsByAccountNumber(@PathVariable("accountNumber") String accountNumber){

        Random random = new Random();

        int random_number = random.nextInt(99);

        if((random_number % 2) == 0){
            log.info("cards error");
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }



        return (ResponseEntity<List<Card>>) cardService.getCardsByAccountNumber(accountNumber);
    }
}
