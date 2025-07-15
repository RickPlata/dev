package com.banco.service;

import com.banco.model.CuentaBancaria;

import java.time.LocalDate;

//Subclase retiro
public class Retiro extends Transaccion{

    private CuentaBancaria cuentaBancaria;

    public Retiro(CuentaBancaria cuentaBancaria, double monto) {

        this.monto = monto;
        this.cuentaBancaria = cuentaBancaria;
        this.tipoTransaccion = TipoTransaccion.RETIRO;
        this.date = LocalDate.now();

    }

    //metodo para aplicar la logica de retiro
    @Override
    public String ejecutar() {
        return cuentaBancaria.retirar(monto);
    }

    @Override
    public String toString() {
        return "RETIRO - CuentaBancaria: " + cuentaBancaria.getNumeroCuenta() + " - Monto: $" + monto;
    }
}
