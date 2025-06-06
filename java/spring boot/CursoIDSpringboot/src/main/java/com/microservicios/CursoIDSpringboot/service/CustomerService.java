package com.microservicios.CursoIDSpringboot.service;

import com.microservicios.CursoIDSpringboot.model.Customer;
import com.microservicios.CursoIDSpringboot.view.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getCustomers();
    CustomerDto getCustomer(String CustomerNumber) throws Exception;
    Customer validateCostumer(String customerNumber, String password);

}