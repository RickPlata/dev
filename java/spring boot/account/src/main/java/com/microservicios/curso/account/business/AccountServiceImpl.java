package com.microservicios.curso.account.business;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;
import com.microservicios.curso.account.repository.AccountRepository;
import com.microservicios.curso.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    private final static String STATUS = "ACT";

   //@Override
    public List<Account> getAccounts(){

        List<Account> accounts = accountRepository.findAll();

        return accounts.stream().filter(account -> account.getStatus().equals("ACT"))
                .collect(Collectors.toList());
    }

    //@Override
    public Account getAccount(AccountId accountId){
        return null;
    }
}
