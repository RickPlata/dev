package com.microservicios.curso.account.service;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;

import java.util.List;

public interface AccountService {
    List<Account> getAccounts();
    Account getAccount(AccountId accountId);
}
