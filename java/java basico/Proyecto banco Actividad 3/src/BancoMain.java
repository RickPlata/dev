import com.banco.model.CuentaAhorro;
import com.banco.model.CuentaBancaria;
import com.banco.model.CuentaNomina;
import com.banco.service.*;

import java.util.ArrayList;
import java.util.List;

public class BancoMain {

    public static void main (String[] args){

        CuentaBancaria c1 = new CuentaBancaria("Juan Pérez","001", TipoCuenta.NOMINA);
        CuentaBancaria c2 = new CuentaBancaria("Miguel Ángel", "005", TipoCuenta.NOMINA);
        CuentaBancaria c3 = new CuentaBancaria("Ana Gomez", "002", TipoCuenta.AHORRO);
        CuentaBancaria c4 = new CuentaBancaria("Carlos Ruiz", "003", TipoCuenta.AHORRO);

        List<Transaccion> historial = new ArrayList<>();

        historial.add(new Deposito(c1, 5000));
        historial.add(new Retiro(c1, 2000));
        historial.add(new Transferencia(c1, c2, 1000));
        historial.add(new Deposito(c2, 1500));
        historial.add(new Retiro(c2, 500));
        historial.add(new Retiro(c3, 200));
        historial.add(new Deposito(c4, 5335));
        historial.add(new Transferencia(c3, c4, 900));

        for (Transaccion t : historial) {
            System.out.println(t.ejecutar());
        }

        System.out.println("\n--- Historial de transacciones ---");
        int i = 1;
        for (Transaccion t : historial) {
            System.out.println("#" + i++ + " - " + t.toString());
        }

        System.out.println("\n--- Estado final de cuentas ---");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);


    }


}
