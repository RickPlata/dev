package com.big.curso.springboot.app.springboot_crud.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity //Aca estamos dandole propedades de entidad para que esta clase consuma la tabla en la base de datos
@Table(name="products")
public class Product {

    @Id  //Estos decoradores son para indidcar en este caso que esta variable es la columna id la cual en la tabla en la base de datos es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer price;
    private String description;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
