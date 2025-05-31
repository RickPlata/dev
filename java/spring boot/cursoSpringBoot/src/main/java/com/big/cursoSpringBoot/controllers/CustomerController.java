package com.big.cursoSpringBoot.controllers;

import com.big.cursoSpringBoot.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {



    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(1, "Ricardo", "big", "password1"),
            new Customer(2, "Juan", "jhon", "password2"),
            new Customer(3, "Jorge", "george", "password3")
    ));

    @GetMapping("customers")
    public List<Customer> getCustomers(){
        return customers;
    }

    @GetMapping("customers/{username}")
    public Customer getCliente(@PathVariable String username) {
        for(Customer c : customers){
            if(c.getUsername().equalsIgnoreCase(username)){
                return c;
            }
        }
        return null;
    }
}
