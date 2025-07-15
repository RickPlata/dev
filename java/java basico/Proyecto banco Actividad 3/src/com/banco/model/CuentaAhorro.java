package com.banco.model;

import com.banco.service.TipoCuenta;
import com.banco.service.Transaccionable;

public class CuentaAhorro implements Transaccionable {
    //parametros con encapsulamiento private
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private TipoCuenta tipo;

    //constructor
    public CuentaAhorro(String titular, String numeroCuenta){

        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.tipo = TipoCuenta.AHORRO;

    }

    //metodos
    @Override
    public String depositar(double monto){

        saldo += monto;
        return "[DEPOSITO] CuentaBancaria " + numeroCuenta + " recibio $" + monto;

    }

    public String consultarSaldo(){
        return "Saldo actual en cuenta " + numeroCuenta + " -----> $" + saldo;
    }

    @Override
    public String retirar(double monto){
        saldo -= monto;
        return "[RETIRO] CuentaBancaria " + numeroCuenta + " retiro " + monto;
    }

    public boolean transferir(CuentaBancaria c, double monto){
        if (this.saldo >= monto) {
            this.saldo -= monto;
            c.depositar(monto); // o destino.saldo += monto;
            return true;
        }
        return false;

    }


    //setters y getters
    public String getTitular(){return titular;}
    public String getNumeroCuenta(){return numeroCuenta;}
    public double getSaldo(){return saldo;}
    public TipoCuenta getTipo(){return tipo;}

    public void setTitular(String titular){this.titular = titular;}
    public void setNumeroCuenta(String numeroCuenta){this.numeroCuenta = numeroCuenta;}
    public void setSaldo(double saldo){this.saldo = saldo;}
    public void setTipo(TipoCuenta tipo){this.tipo = tipo;}

    @Override
    public String toString(){
        return "Cuenta Ahorro: " + numeroCuenta + " | Titular: " + titular + " | Saldo: " + saldo + " | Tipo: " + tipo;
    }
}
