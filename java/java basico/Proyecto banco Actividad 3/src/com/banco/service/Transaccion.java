package com.banco.service;

//clase abstracta con una variable monto y su contructor
public abstract class Transaccion {

    protected double monto;

    public Transaccion(double monto){
        this.monto = monto;
    }

    public abstract String ejecutar();

}
