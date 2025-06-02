package com.big.cursoSpringBoot.controllers;

import com.big.cursoSpringBoot.domain.Customer;
import org.springframework.beans.propertyeditors.CustomMapEditor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {



    private List<Customer> customers = new ArrayList<>(Arrays.asList(
            new Customer(1, "Ricardo", "big", "password1"),
            new Customer(2, "Juan", "jhon", "password2"),
            new Customer(3, "Jorge", "george", "password3")
    ));

    //@GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getCustomers(){
        return customers;
    }

    //@GetMapping("/{username}")
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public Customer getCliente(@PathVariable String username) {
        for(Customer c : customers){
            if(c.getUsername().equalsIgnoreCase(username)){
                return c;
            }
        }
        return null;
    }

    //@PostMapping
    @RequestMapping(method = RequestMethod.POST)
    public Customer postCliente(@RequestBody Customer customer){
        customers.add(customer);
        return customer;
    }

    //@PutMapping
    @RequestMapping(method = RequestMethod.PUT)
    public Customer putCliente(@RequestBody Customer customer){
        for(Customer c : customers){
            if(c.getID() == customer.getID()){
                c.setName(customer.getName());
                c.setUsername(customer.getUsername());
                c.setPassword(customer.getPassword());

                System.out.println(c);

                return c;
            }
        }
        return null;
    }

    //@DeleteMapping("/{id}")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Customer deleteCliente(@PathVariable int id){
       for (Customer c: customers){
           if (c.getID() == id){
               customers.remove(c);

               return c;
           }
       }
       return null;
    }

    //@PatchMapping
    @RequestMapping(method = RequestMethod.PATCH)
    public Customer patchCliente(@RequestBody Customer customer){
        for(Customer c : customers){
            if(c.getID() == customer.getID()){
                if(customer.getName() != null){
                    c.setName(customer.getName());
                }
                if(customer.getUsername() != null){
                    c.setUsername(customer.getUsername());
                }
                if(customer.getPassword() != null){
                    c.setPassword(customer.getPassword());
                }
            }
            return c;
        }
        return null;
    }

}
