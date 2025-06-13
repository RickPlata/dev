package com.microservicios.Customer.service;

import com.microservicios.Customer.model.Customer;
import com.microservicios.Customer.view.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getCustomers();
    CustomerDto getCustomer(String CustomerNumber) throws Exception;
    Customer validateCostumer(String customerNumber, String password);

}