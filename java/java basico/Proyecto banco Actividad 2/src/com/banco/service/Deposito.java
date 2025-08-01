package com.banco.service;

import com.banco.model.Cuenta;

//Subclase Deposito que hereda de trasaccion
public class Deposito extends Transaccion {

    private Cuenta cuenta;

    
    public  Deposito (Cuenta cuenta, double monto){
        //seinvoca al constructor de la clase padre
        super(monto);
        this.cuenta = cuenta;
    }

    //metodo para aplicar la logica de deposito
    @Override
    public String ejecutar(){
        return cuenta.depositar(monto);
    }

    @Override
    public String toString(){
        return "Depsito - cuenta: " + cuenta.getNumeroCuenta() + "Monto: $" + monto;
    }
}
