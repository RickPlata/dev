package com.microservices.curso.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.curso.h2.model.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {
    
    @Autowired
    private CustomerRepository CustomerRepository;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return CustomerRepository.findAll();
    }

    @GetMapping("/customers/{customerNumber}")
    public Customer gCustomer(@PathVariable("customerNumber") String customerNumber)
        throws Exception {

            return CustomerRepository.findById(customerNumber)
                .orElseThrow(() -> new Exception("Customer not found"));
        }
}
