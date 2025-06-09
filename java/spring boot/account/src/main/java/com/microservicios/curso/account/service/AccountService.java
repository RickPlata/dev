package com.microservicios.curso.account.service;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;
import com.microservicios.curso.account.view.AccountDto;

import java.util.List;

public interface AccountService {
    List<AccountDto> getAccounts(String customerNumber);
    //Account getAccount(AccountId accountId);
}
