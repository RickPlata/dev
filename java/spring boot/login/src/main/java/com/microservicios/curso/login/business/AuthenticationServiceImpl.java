package com.microservicios.curso.login.business;

import com.microservicios.curso.login.exception.ForbiddenException;
import com.microservicios.curso.login.exception.UnauthorizedException;
import com.microservicios.curso.login.model.Customer;
import com.microservicios.curso.login.repository.CustomerRepository;
import com.microservicios.curso.login.service.AuthenticationService;
import com.microservicios.curso.login.service.SessionManagement;
import com.microservicios.curso.login.util.Util;
import com.microservicios.curso.login.view.Credentials;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;
import java.util.function.BiPredicate;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private SessionManagement sessionManagement;

    private BiPredicate<Customer, Credentials> customerValidation =
            (customer, credentials) -> Objects.nonNull(customer)
                    && customer.getCustomerNumber().equals(credentials.getCustomerNumber())
                    && customer.getPassword().equals(credentials.getPassword());

    @Override
    public Integer authentication(Credentials credentials){
        Customer customer = customerRepository.findById(credentials.getCustomerNumber()).orElseThrow(() -> new ForbiddenException("You are not authorized"));

        if (!customerValidation.test(customer, credentials)){
                    throw new UnauthorizedException("Customer number or password incorrect");
        }

        return 1;
    }

}
