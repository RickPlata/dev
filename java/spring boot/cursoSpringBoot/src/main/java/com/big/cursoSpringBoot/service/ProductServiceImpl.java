package com.big.cursoSpringBoot.service;

import com.big.cursoSpringBoot.domain.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "laptop", 799.99, 10),
            new Product(2, "smartphone", 499.99, 25),
            new Product(3, "tablet", 299.99, 15),
            new Product(4, "smartwatch", 199.99, 30)
    ));

    public List<Product> getProducts(){return products;}

}
