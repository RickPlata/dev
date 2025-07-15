package com.banco.service;

import com.banco.model.CuentaBancaria;

import java.time.LocalDate;

//Subclase Deposito que hereda de trasaccion
public class Deposito extends Transaccion {

    private CuentaBancaria cuentaOrigen;

    
    public  Deposito (CuentaBancaria cuentaBancaria, double monto){

        this.monto = monto;
        this.cuentaOrigen = cuentaBancaria;
        this.tipoTransaccion = TipoTransaccion.DEPOSITO;
        this.date = LocalDate.now();
    }

    //metodo para aplicar la logica de deposito
    @Override
    public String ejecutar(){
        return cuentaOrigen.depositar(monto);
    }

    @Override
    public String toString(){
        return "Depsito - cuentaBancaria: " + cuentaOrigen.getNumeroCuenta() + "Monto: $" + monto;
    }
}
