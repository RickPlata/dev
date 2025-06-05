package com.microservicios.CursoIDSpringboot.service;

import com.microservicios.CursoIDSpringboot.model.Customer;
import org.apache.logging.log4j.message.StringFormattedMessage;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    Customer getCustomer(String CustomerNumber) throws Exception;

}