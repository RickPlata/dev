package com.microservicios.CursoIDSpringboot.service;

import com.microservicios.CursoIDSpringboot.model.Customer;
import com.microservicios.CursoIDSpringboot.view.CustomerDto;
import org.apache.logging.log4j.message.StringFormattedMessage;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getCustomers();
    CustomerDto getCustomer(String CustomerNumber) throws Exception;

}