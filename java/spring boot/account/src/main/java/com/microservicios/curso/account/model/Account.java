package com.microservicios.curso.account.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name="accounts")
@IdClass(Account.class)
public class Account {

    @Id
    private String customerNumber;

    @Id
    private String accountNumber;

    private Integer productNumber;

    private String productName;

    private String status;

    private BigDecimal balance;

    private String creationDate;

}
