package com.microservicios.curso.account.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class CardID implements Serializable {
    private String accountNumber;
    private String cardNumber;
}
