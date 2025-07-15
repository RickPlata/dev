import com.banco.model.Cuenta;

public class BancoMain {

    public static void main (String[] args){

        Cuenta c1 = new Cuenta(
                "Juan Perez",
                "001");

        Cuenta c2 = new Cuenta(
                "Ana Gomez",
                "002");

        Cuenta c3 = new Cuenta(
                "Carlos Ruiz",
                "003");

        System.out.println(c1.depositar(5000));
        System.out.println(c1.retirar(1000));
        System.out.println(c1.consultarSaldo());
        System.out.println(c2.depositar(3000));
        System.out.println(c2.consultarSaldo());


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }


}
