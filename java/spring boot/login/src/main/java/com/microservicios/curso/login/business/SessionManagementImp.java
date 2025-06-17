package com.microservicios.curso.login.business;

import com.microservicios.curso.login.component.ApiValues;
import com.microservicios.curso.login.exception.ForbiddenException;
import com.microservicios.curso.login.model.Customer;
import com.microservicios.curso.login.repository.CustomerRepository;
import com.microservicios.curso.login.service.SessionManagement;
import com.microservicios.curso.login.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class SessionManagementImp implements SessionManagement {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ApiValues apiValues;

    public SessionManagementImp(
            RedisTemplate<String, String> redisTemplate,
            CustomerRepository customerRepository,
            ApiValues apiValues) {

        this.redisTemplate = redisTemplate;
        this.customerRepository = customerRepository;
        this.apiValues = apiValues;
    }

    @Override
    public String createSession(Customer customer){

        validateCustomerBlocked(customer);
        checkSessionAlive(customer);

        String token = Util.createToken();

        redisTemplate.opsForValue().set(token, customer.getCustomerNumber());

        customer.setIsSessionAlive(1);
        customerRepository.save(customer);

        return token;
    }

    private void validateCustomerBlocked(Customer customer){
        if(customer.getStatus().equals("B")){
            throw new ForbiddenException("Your Customer is blocked");
        }
    }

    private void checkSessionAlive(Customer customer){
        if(customer.getIsSessionAlive()==1){
            throw  new ForbiddenException("You have an active session");
        }

    }

}
