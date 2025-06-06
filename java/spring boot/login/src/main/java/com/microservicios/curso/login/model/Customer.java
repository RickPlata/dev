package com.microservicios.curso.login.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "customer_number")
    private String customerNumber;

    private String password;

    @Column(name = "session")
    private Integer isSessionAlive;

    private String status;
}
