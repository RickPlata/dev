package com.banco.service;

import com.banco.model.Cuenta;

//Subclase retiro
public class Retiro extends Transaccion{

    private Cuenta cuenta;

    public Retiro(Cuenta cuenta, double monto) {
        super(monto);
        this.cuenta = cuenta;
    }

    @Override
    public String ejecutar() {
        return cuenta.retirar(monto);
    }

    @Override
    public String toString() {
        return "RETIRO - Cuenta: " + cuenta.getNumeroCuenta() + " - Monto: $" + monto;
    }
}
