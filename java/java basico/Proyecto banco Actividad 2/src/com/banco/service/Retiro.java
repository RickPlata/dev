package com.banco.service;

import com.banco.model.Cuenta;

//Subclase retiro
public class Retiro extends Transaccion{

    private Cuenta cuenta;

    public Retiro(Cuenta cuenta, double monto) {
        //se invoca el constructor de la clase padre
        super(monto);
        this.cuenta = cuenta;
    }

    //metodo para aplicar la logica de retiro
    @Override
    public String ejecutar() {
        return cuenta.retirar(monto);
    }

    @Override
    public String toString() {
        return "RETIRO - Cuenta: " + cuenta.getNumeroCuenta() + " - Monto: $" + monto;
    }
}
