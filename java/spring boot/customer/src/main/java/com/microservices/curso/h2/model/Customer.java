package com.microservices.curso.h2.model;

import java.lang.annotation.Inherited;

import javax.persistence.column;

@Entity
@Table(name= "CUSTOMERS")

public class Customer {


    @Id
    @Column(name = "CUSTOMER_NUMBER")
    private String customerNumber;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "SESSION")
    private boolean isSessionAlive;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "STATUS")
    private String status;

    @Column(name = "CREATION")
    private String creation;



    public String getCustmerNumber() {
        return customerNumber;
    }

    public String setCustomerNumber(String CustomerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSession() {
        return isSessionAlive;
    }

    public String setSession(boolean isSessionAlive) {
        this.isSessionAlive = isSessionAlive;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        this.status = status;
    }

    public String getCreation() {
        return creation;
    }

    public String setCreation(String creation) {
        this.creation = creation;
    }
    

}
