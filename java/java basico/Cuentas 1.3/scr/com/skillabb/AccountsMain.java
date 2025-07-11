import model.Account;
import service.imp.AccountsImp;

public class AccountsMain {

    public static void main (String[] args){

        //se instancia la clase Account y una clase imp para inovcar el metodo validate accounts
        Account a = new Account();
        Account b = new Account();
        AccountsImp imp = new AccountsImp();

        //se inicializa otro objeto con las condiciones para comprobar el funcionamiento del metodo validate accounts
        b.accountNumber = "32145678";
        b.balance = 0;
        b.customerName = "Rick Plata";

        //se imprimen los valores del obejto a
        System.out.println("Nombre de cliente -----> " +  a.customerName);
        System.out.println("Numero de cuenta -----> " +  a.accountNumber);
        System.out.println("Balance -----> " +  a.balance);
        imp.validateAccounts(a);
        System.out.println("--------------------------------------------");
        //Se imprimen los valores del objeto b
        System.out.println("Nombre de cliente -----> " +  b.customerName);
        System.out.println("Numero de cuenta -----> " +  b.accountNumber);
        System.out.println("Balance -----> " +  b.balance);
        imp.validateAccounts(b);

        //llamdo al metodo generateAccounts y impresion de las cuentas
        imp.generateAccounts();
        System.out.println("--------------------------------------------------------");
        System.out.println("Iteracion de cuentas");

        for(Account account: imp.accounts){

            System.out.println("Nombre de cliente -----> " +  account.customerName);
            System.out.println("Numero de cuenta -----> " +  account.accountNumber);
            System.out.println("Numero de cuenta -----> " +  account.balance);
            System.out.println("--------------------------------------------------------");

        }
    }

}
