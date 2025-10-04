package com.big.curso.springboot.app.springboot_crud.respositories;

import org.springframework.data.repository.CrudRepository;

import com.big.curso.springboot.app.springboot_crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}

// esta es una interfaz que nos ayuda a referenciar los metodos de CrudRepositroy