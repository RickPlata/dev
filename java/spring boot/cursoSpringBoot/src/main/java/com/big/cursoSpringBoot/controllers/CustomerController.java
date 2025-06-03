package com.big.cursoSpringBoot.controllers;

import com.big.cursoSpringBoot.domain.Customer;
import org.springframework.beans.propertyeditors.CustomMapEditor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers(){

        //return customers;

        return ResponseEntity.ok(customers);
    }

    //@RequestMapping(value = "/{username}", method = RequestMethod.GET)
    @GetMapping("/{username}")
    public ResponseEntity<?> getCliente(@PathVariable String username) {
        for(Customer c : customers){
            if(c.getUsername().equalsIgnoreCase(username)){
                //return c;

                return ResponseEntity.ok(c);
            }
        }
       // return null;
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existe un usuario con ese username");
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public ResponseEntity<?> postCliente(@RequestBody Customer customer){
        customers.add(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body("El cliente se ha creado existosamente: username -> " + customer.getUsername());
    }

    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    public ResponseEntity<?> putCliente(@RequestBody Customer customer){
        for(Customer c : customers){
            if(c.getID() == customer.getID()){
                c.setName(customer.getName());
                c.setUsername(customer.getUsername());
                c.setPassword(customer.getPassword());

                System.out.println(c);

                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.noContent().build();
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCliente(@PathVariable int id){
       for (Customer c: customers){
           if (c.getID() == id){
               customers.remove(c);

               return ResponseEntity.noContent().build();
           }
       }
       return ResponseEntity.noContent().build();
    }

    //@RequestMapping(method = RequestMethod.PATCH)
    @PatchMapping
    public ResponseEntity<?> patchCliente(@RequestBody Customer customer){
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
            return ResponseEntity.ok("Cliente modificado exitosamente: username -> " + c.getUsername());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado con el id ---> " + customer.getID());
    }

}
