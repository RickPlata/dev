package com.microservicios.curso.account.api;

import com.microservicios.curso.account.model.Account;
import com.microservicios.curso.account.service.AccountService;
import com.microservicios.curso.account.view.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/accounts/{customerNumber}")
    public List<AccountDto> accountRetrieve(@RequestHeader("Authorization") String authorization, @PathVariable String customerNumber){

        System.out.println(authorization);

        System.out.println(redisTemplate.opsForValue().get(authorization));

        return accountService.getAccounts(customerNumber);
    }
}
