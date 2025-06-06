package com.microservicios.curso.login.repository;

import com.microservicios.curso.login.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
