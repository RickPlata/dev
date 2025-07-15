package service.imp;
import model.Account;

public class AccountsImp {

    public void validateAccounts(Account account){

        if(account.balance > 0 && !account.accountNumber.equals("32145678")){
            System.out.println("La cuenta existe");
        }else{
            System.out.println("La cuenta no existe");
        }
    }

}
