package com.microservicios.curso.account.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
public class AccountId implements Serializable {
    private String customerNumber;
    private String accountNumber;
}
