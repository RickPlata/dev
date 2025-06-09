package com.microservicios.curso.account.repository;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.model.AccountId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, AccountId> {

    List<Account> findByCustomerNumber(String customerNumber);

}

