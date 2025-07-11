package model;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalTime;


public class Account {

    //variables publicas
    private String customerName;
    private String accountNumber;
    private double balance;
    private LocalDate date;
    private LocalTime time;
    private List<String> cardNumber = new ArrayList<>();

    //constructor que inicializa todos los campos
    public Account(String customerName, String accountNumber, double balance, List<String> cardNumber){

        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.cardNumber = cardNumber;
    }

    //getters
    public String getCustomerName(){return customerName;}
    public String getAccountNumber(){return accountNumber;}
    public double getBalance(){return balance;}
    public LocalDate getDate(){return date;}
    public LocalTime getTime(){return time;}
    public List<String> getCardNumber(){return cardNumber;}

    //setters
    public void setCustomerName(String customerName){this.customerName = customerName;}
    public void setAccountNumber(String accountNumber){this.accountNumber = accountNumber;}
    public void setBalance(double balance){this.balance = balance;}
    public void setDate(LocalDate date){this.date = date;}
    public void setTime(LocalTime time){this.time = time;}
    public void setCardNumber(List<String> cardNumber){this.cardNumber = cardNumber;}



}


// Generar los siguientes cambios en la clase Account:

// Agregar un campo más el cual debe ser una lista de Strings utilizando List, y el campo debe llamarse cardNumber.

// Generar un construtor que inicialice todos los campos de la clase Account.

// Generar un nuevo modelo que de nombre Accounts el cual contenga una lista de Account.

// El método generateAccounts el cual debe recibir dos parámetros para generar el tamaño de cuentas y de tarjetas.

// Sobreescribir el método toString de las clases Account y Accounts para imprimir los objetos utilizando el IDE.
