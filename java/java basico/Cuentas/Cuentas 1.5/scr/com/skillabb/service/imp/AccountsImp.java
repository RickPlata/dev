package service.imp;

import model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountsImp {

    //variable de instancia que puede contener 3 cuentas
    private Account[] accounts;

    //metodo para inicializar 3 cuentas
    public void generateAccounts(int numAccounts, int numCards){

        //se inicializa el arreglo con el valor numAccounts para saber cuantas se van a generar
        accounts = new Account[numAccounts];
        List<String> cards = new ArrayList<>();

        //ciclo for para crea el numero de tarjetas determinado
        for(int i = 0; i < numAccounts; i++){

            //ciclo for anidado para generar tarjetas
            for(int j = 0; j < numCards; j++){
                String card = UUID.randomUUID().toString();
                cards.add(card.replace("-", "").substring(0,16));
            }
            accounts[i] = new Account(getName(), generateAccountNumber(),generateAmount(), cards);
        }


    }
    public void validateAccounts(Account account){

        if(account.balance > 0 && !account.accountNumber.equals("32145678")){
            System.out.println("La cuenta existe");
        }else{
            System.out.println("La cuenta no existe");
        }
    }


    private String getName() {
        
        List<String> names = new ArrayList<>();
        
        names.add("Daniel");
        names.add("Carlos");
        names.add("Adrian");
        names.add("Ruben");
        names.add("Rocio");
        
        
        List<String> lastnames = new ArrayList<>();
        
        lastnames.add(" Lopez");
        lastnames.add(" Santiago");
        lastnames.add(" Martinez");
        lastnames.add(" Perez");
        lastnames.add(" Ortega");
        
        
        Random rand = new Random();
        
        
        return names.get(rand.nextInt(names.size())) + lastnames.get(rand.nextInt(lastnames.size()));
    
    }
    
    
    private String generateAccountNumber() {
    
        Random rand = new Random();
        
        return String.valueOf(100000000 + rand.nextInt(900000000));
    
    }
    
    
    private double generateAmount() {
    
        return new Random().nextDouble();
    
    }

}