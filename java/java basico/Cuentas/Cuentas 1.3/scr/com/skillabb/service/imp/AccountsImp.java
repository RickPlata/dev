package service.imp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Account;

public class AccountsImp {

    //variable de instancia que puede contener 3 cuentas
    public Account[] accounts = new Account[3];

    //metodo para inicializar 3 cuentas
    public void generateAccounts(){
        accounts[0] = new Account();
        accounts[0].customerName = "Rick plata";
        accounts[0].accountNumber = "20251594";
        accounts[0].balance = 34531.87;

        accounts[1] = new Account();
        accounts[1].customerName = "Giovani Giorgio";
        accounts[1].accountNumber = "20255312";
        accounts[1].balance = 43525.64;

        accounts[2] = new Account();
        accounts[2].customerName = "Itachi Uchiha";
        accounts[2].accountNumber = "20254356";
        accounts[2].balance = 85632.53;

    }
    public void validateAccounts(Account account){

        if(account.balance > 0 && !account.accountNumber.equals("32145678")){
            System.out.println("La cuenta existe");
        }else{
            System.out.println("La cuenta no existe");
        }
    }

}