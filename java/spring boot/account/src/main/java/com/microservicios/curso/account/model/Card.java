package com.microservicios.curso.account.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cards")
@IdClass(CardID.class)
public class Card {
    @Id
    private String accountNumber;

    @Id
    private String cardNumber;

    private String cardType;

    private String status;

    private String creationDate;


}
