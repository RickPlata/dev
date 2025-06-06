package com.microservicios.CursoIDSpringboot.controllers;


import com.microservicios.CursoIDSpringboot.model.Customer;
import com.microservicios.CursoIDSpringboot.repository.CustomerRepository;
import com.microservicios.CursoIDSpringboot.service.CustomerService;
import com.microservicios.CursoIDSpringboot.view.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerDto> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerNumber}")
    public CustomerDto getCustomer(@PathVariable String customerNumber) throws Exception {
        return customerService.getCustomer(customerNumber);
    }

    @GetMapping("/customers/validate")
    public Customer validateCostumer(
            @RequestParam(required = false) String customerNumber,
            @RequestParam(required = false) String password
            ){
        return customerService.validateCostumer(customerNumber, password);
    }
}
