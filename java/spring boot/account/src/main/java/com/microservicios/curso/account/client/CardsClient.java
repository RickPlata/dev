package com.microservicios.curso.account.client;

import com.microservicios.curso.account.model.Card;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "cards-client", url = "localhost:8080")
public interface CardsClient {
    @GetMapping("/cards/{accountNumber}")
    List<Card> getCardsByAccountNumber(@PathVariable String accountNumber);
}
