package org.big.junit5.ejemplos.models;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void test_nombre_cuenta() {
        Cuenta cuenta = new Cuenta("ricardo", new BigDecimal("1000.12324"));

        //cuenta.setPersona("ricardo");
        String esperado = "ricardo";
        String real = cuenta.getPersona();

        assertEquals(esperado,real);
        assertTrue(real.equals("ricardo"));
    }

    @Test
    void test_saldo_cuenta(){
        Cuenta cuenta = new Cuenta("ricardo", new BigDecimal("1000.1234"));

        assertEquals(1000.1234, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);

    }
}