package com.microservicios.CursoIDSpringboot.repository;

import com.microservicios.CursoIDSpringboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    List<Customer> findByStatus(String status);
}
