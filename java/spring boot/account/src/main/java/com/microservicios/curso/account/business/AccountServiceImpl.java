package com.microservicios.curso.account.business;

import com.microservicios.curso.account.client.CardsClient;
import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;
import com.microservicios.curso.account.repository.AccountRepository;
import com.microservicios.curso.account.service.AccountService;
import com.microservicios.curso.account.view.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CardsClient cardsClient;

    private Function<Account, AccountDto> accountMapper =
        account -> new AccountDto(
                    account.getAccountNumber(),
                    account.getProductNumber(),
                    account.getProductName(),
                    account.getBalance(),
                    cardsClient.getCardsByAccountNumber(String.valueOf(account)));

    private final static String STATUS = "ACT";

   //@Override
    public List<AccountDto> getAccounts(String customerNumber){

        List<Account> accounts = accountRepository.findByCustomerNumber(customerNumber);

        accounts.forEach(a -> System.out.println(cardsClient.getCardsByAccountNumber(a.getAccountNumber())));

        return accounts.stream().filter(account -> account.getStatus().equals(STATUS)).map(accountMapper)
                .collect(Collectors.toList());
    }

}
