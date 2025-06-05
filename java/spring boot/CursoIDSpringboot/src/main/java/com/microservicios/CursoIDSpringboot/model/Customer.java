package com.microservicios.CursoIDSpringboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    @Id
    @Column(name = "customer_number")
    private String customerNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "session")
    private Integer isSessionAlive;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private String status;

    @Column(name = "creation")
    private String creation;


    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIsSessionAlive() {
        return isSessionAlive;
    }

    public void setIsSessionAlive(Integer isSessionAlive) {
        this.isSessionAlive = isSessionAlive;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreation() {
        return creation;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isSessionAlive=" + isSessionAlive +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                ", creation='" + creation + '\'' +
                '}';
    }
}
