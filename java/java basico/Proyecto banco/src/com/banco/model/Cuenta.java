package com.banco.model;

public class Cuenta {

    //Variables
    private String titular;
    private String numeroCuenta;
    private double saldo;

    //constructor
    public Cuenta(String titular, String numeroCuenta){

        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;

    }

    //metodos
    public String depositar(double monto){

        saldo += monto;
        return "Depositando -----> $" + saldo + " en cuenta " + numeroCuenta;

    }

    public String consultarSaldo(){
        return "Saldo actual en cuenta " + numeroCuenta + " -----> $" + saldo;
    }

    public String retirar(double monto){
        saldo -= monto;
        return "Retirando -----> $" + saldo + " en cuenta " + numeroCuenta;
    }


    //setters y getters
    public String getTitular(){return titular;}
    public String getNumeroCuenta(){return numeroCuenta;}
    public double getSaldo(){return saldo;}

    public void setTitular(String titular){this.titular = titular;}
    public void setNumeroCuenta(String numeroCuenta){this.numeroCuenta = numeroCuenta;}
    public void setSaldo(double saldo){this.saldo = saldo;}

    @Override
    public String toString(){
        return "Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo: " + saldo;
    }

}
