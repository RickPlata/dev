package com.big.cursoSpringBoot.service;

import com.big.cursoSpringBoot.domain.Product;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Primary
@Service
@ConditionalOnProperty(name = "service.products", havingValue = "lista")
public class ProductServiceImpl implements ProductService {


    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "laptop", 799.99, 10),
            new Product(2, "smartphone", 499.99, 25),
            new Product(3, "tablet", 299.99, 15),
            new Product(4, "smartwatch", 199.99, 30)
    ));

    @Override
    public List<Product> getProducts(){
        return products;
    }

}
