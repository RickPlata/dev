package com.banco.service;

import com.banco.model.CuentaBancaria;

import java.time.LocalDate;

public class Transferencia extends Transaccion{
    private CuentaBancaria c1;
    private CuentaBancaria c2;

    public Transferencia(CuentaBancaria c1, CuentaBancaria c2, double monto) {
        this.monto = monto;
        this.c1 = c1;
        this.c2 = c2;
        this.tipoTransaccion = TipoTransaccion.TRANSFERENCIA;
        this.date = LocalDate.now();
    }

    //metodo ejecutar para aplicar la logica transferencia
    @Override
    public String ejecutar() {
        if (c1.transferir(c2, monto)) {
            return "[TRANSFERENCIA] $" + monto + " de cuenta " + c1.getNumeroCuenta() + " a cuenta " + c2.getNumeroCuenta();
        } else {
            return "[TRANSFERENCIA FALLIDA] Fondos insuficientes en cuenta " + c1.getNumeroCuenta();
        }
    }

    @Override
    public String toString() {
        return "TRANSFERENCIA - Origen: " + c1.getNumeroCuenta() + " - Destino: " + c2.getNumeroCuenta() + " - Monto: $" + monto;
    }
}
