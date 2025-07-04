import model.Account;

public class AccountsMain {

    public static void main (String[] args){

        //se instancia la clase Account
        Account a = new Account();

        //se imprimen los valores de manera directa por ser variables public
        System.out.println("Nombre de cliente -----> " +  a.customerName);
        System.out.println("Numero de cuenta -----> " +  a.accountNumber);
        System.out.println("Balance -----> " +  a.balance);
        
    }

}
