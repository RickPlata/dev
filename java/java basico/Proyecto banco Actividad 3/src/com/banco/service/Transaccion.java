package com.banco.service;

import com.banco.model.CuentaBancaria;

import java.time.LocalDate;

//clase abstracta con una variable monto y su contructor
public abstract class Transaccion {

    protected double monto;
    protected LocalDate date;
    protected CuentaBancaria cuentaOrigen;
    protected CuentaBancaria cuentaDestino;
    protected TipoTransaccion tipoTransaccion;

    //meotdo para ejecutar la logica de cada transaccion
    public abstract String ejecutar();

}
