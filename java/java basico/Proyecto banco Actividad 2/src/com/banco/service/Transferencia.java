package com.banco.service;

import com.banco.model.Cuenta;

public class Transferencia extends Transaccion{
    private Cuenta c1;
    private Cuenta c2;

    public Transferencia(Cuenta c1, Cuenta c2, double monto) {
        super(monto);
        this.c1 = c1;
        this.c2 = c2;
    }

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
