package com.microservicios.curso.account.api;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public List<Account> accountsRetrieve(){
        return accountService.getAccounts();
    }

    @GetMapping("/accounts/{customerNumber}")
    public List<Account> accountRetrieve(@PathVariable String customerNumber){
        return accountService.getAccounts();
    }
}
