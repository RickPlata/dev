package com.banco.service;

//clase abstracta con una variable monto y su contructor
public abstract class Transaccion {

    protected double monto;

    //constructor de la clase padre
    public Transaccion(double monto){
        this.monto = monto;
    }

    //meotdo para ejecutar la logica de cada transaccion
    public abstract String ejecutar();

}
