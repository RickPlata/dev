package com.microservicios.curso.account.business;

import com.microservicios.curso.account.model.Card;
import com.microservicios.curso.account.repository.CardRepository;
import com.microservicios.curso.account.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepository cardRepository;

    @Override
    public List<Card> getCardsByAccountNumber(String accountNumber){
        return cardRepository.findByAccountNumber(accountNumber);
    }

}
