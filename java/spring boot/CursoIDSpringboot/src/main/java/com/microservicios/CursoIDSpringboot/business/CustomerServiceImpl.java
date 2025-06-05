package com.microservicios.CursoIDSpringboot.business;

import com.microservicios.CursoIDSpringboot.model.Customer;
import com.microservicios.CursoIDSpringboot.repository.CustomerRepository;
import com.microservicios.CursoIDSpringboot.service.CustomerService;
import com.microservicios.CursoIDSpringboot.view.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> getCustomers() {

        List<Customer> customers = customerRepository.findAll();
        List<CustomerDto> customersDto = new ArrayList<>();

        for(Customer customer : customers) {
            customersDto.add(customerMapper(customer));
        }

        return customersDto;
    }

    @Override
    public CustomerDto getCustomer(String customerNumber) throws Exception{
        return customerMapper(customerRepository.findById(customerNumber)
                .orElseThrow(() -> new Exception("Customer Not Found")));
    }

    private CustomerDto customerMapper(Customer customer){
        return new CustomerDto(customer.getName(), customer.getLastName(), customer.getEmail());
    }

}
