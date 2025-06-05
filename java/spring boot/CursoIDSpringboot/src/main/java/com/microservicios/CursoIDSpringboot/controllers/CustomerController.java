package com.microservicios.CursoIDSpringboot.controllers;


import com.microservicios.CursoIDSpringboot.model.Customer;
import com.microservicios.CursoIDSpringboot.repository.CustomerRepository;
import com.microservicios.CursoIDSpringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
}
