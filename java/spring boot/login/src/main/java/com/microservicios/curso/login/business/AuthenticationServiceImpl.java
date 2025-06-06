package com.microservicios.curso.login.business;

import com.microservicios.curso.login.model.Customer;
import com.microservicios.curso.login.repository.CustomerRepository;
import com.microservicios.curso.login.service.AuthenticationService;
import com.microservicios.curso.login.view.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.function.BiPredicate;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private CustomerRepository customerRepository;

    BiPredicate<Customer, Credentials> customerValidation =
            (customer, credentials) -> Objects.isNull(customer)
                    || customer.getCustomerNumber().equals(credentials.getCustomerNumber())
                    || customer.getPassword().equals(credentials.getPassword());

    @Override
    public Integer authentication(Credentials credentials) throws Exception{
        Customer customer = customerRepository.findById(credentials.getCustomerNumber()).orElse(null);;

        if (customerValidation.test(customer, credentials)){
                    return 0;
        }

        return 1;
    }

}
