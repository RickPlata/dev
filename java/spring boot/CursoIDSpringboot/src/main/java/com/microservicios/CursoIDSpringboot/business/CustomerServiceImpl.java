package com.microservicios.CursoIDSpringboot.business;

import com.microservicios.CursoIDSpringboot.model.Customer;
import com.microservicios.CursoIDSpringboot.repository.CustomerRepository;
import com.microservicios.CursoIDSpringboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
