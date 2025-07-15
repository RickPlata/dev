package com.banco.service;

//Interface con los metodos depositar y retirar
public interface Transaccionable {

    String depositar(double monto);
    String retirar(double monto);

}
