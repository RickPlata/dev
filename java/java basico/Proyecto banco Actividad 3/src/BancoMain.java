import com.banco.model.Cuenta;
import com.banco.service.*;

import java.util.ArrayList;
import java.util.List;

public class BancoMain {

    public static void main (String[] args){

        Cuenta c1 = new Cuenta("Juan Pérez", "001", TipoCuenta.NOMINA);
        Cuenta c2 = new Cuenta("Miguel Ángel", "005", TipoCuenta.NOMINA);

        List<Transaccion> historial = new ArrayList<>();

        historial.add(new Deposito(c1, 5000));
        historial.add(new Retiro(c1, 2000));
        historial.add(new Transferencia(c1, c2, 1000));
        historial.add(new Deposito(c2, 1500));
        historial.add(new Retiro(c2, 500));

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

    }


}
