import model.Account;
import service.imp.AccountsImp;

public class AccountsMain {

    public static void main (String[] args){

        //se instancia la clase Account y una clase imp para inovcar el metodo validate accounts
        Account a = new Account();


        //se imprimen los valores del obejto a
        System.out.println("Nombre de cliente -----> " +  a.getAccountNumber());
        System.out.println("Numero de cuenta -----> " +  a.getAccountNumber());
        System.out.println("Balance -----> " +  a.getBalance());
        System.out.println("Fecha -----> " +  a.getDate());
        System.out.println("Hora -----> " +  a.getTime());

    }

}
