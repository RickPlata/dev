package com.microservicios.curso.account.repository;

import com.microservicios.curso.account.model.CardID;
import com.microservicios.curso.account.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, CardID> {
    List<Card> findByAccountNumber(String accountNumber);
}
