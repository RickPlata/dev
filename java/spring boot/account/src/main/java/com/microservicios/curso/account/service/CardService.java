package com.microservicios.curso.account.service;

import com.microservicios.curso.account.model.Card;

import java.util.List;

public interface CardService {
    List<Card> getCardsByAccountNumber(String accountNumber);
}
