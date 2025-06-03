package com.big.cursoSpringBoot.controllers;

import com.big.cursoSpringBoot.domain.Product;
import com.big.cursoSpringBoot.service.ProductServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {

    ProductServiceImpl productService = new ProductServiceImpl();

    @GetMapping
    public ResponseEntity<?> getProducts(){
        List<Product> products = productService.getProducts();
        return ResponseEntity.ok(products);
    }

}
