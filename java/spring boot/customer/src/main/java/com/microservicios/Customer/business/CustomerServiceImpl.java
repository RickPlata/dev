package com.microservicios.Customer.business;

import com.microservicios.Customer.model.Customer;
import com.microservicios.Customer.repository.CustomerRepository;
import com.microservicios.Customer.service.CustomerService;
import com.microservicios.Customer.view.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

   @Override
    public Customer validateCostumer(String customerNumber, String password){
        Optional<Customer> optionalCustomer = customerRepository.findById(customerNumber);

        if(optionalCustomer.isPresent()){
            Customer customer = optionalCustomer.get();

            if (customer.getPassword().equals(password) && customer.getStatus().equals("A")) {
                customer.setIsSessionAlive(1);
                customerRepository.save(customer);
                return customer;
            }
        }
       return null;
   }

}
