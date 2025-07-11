package model;

import java.util.ArrayList;
import java.util.List;

public class Accounts {

    private List<Account> accounts = new ArrayList<>();

    //setter y getter
    public List<Account> getAccounts(){
        return accounts;
    }

    public void setAccounts(List<Account> accounts){
        this.accounts = accounts;
    }

}
