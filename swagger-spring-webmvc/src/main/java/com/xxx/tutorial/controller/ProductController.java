package com.xxx.tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xxx.tutorial.model.Product;

@RestController
@RequestMapping(value = { "/api/product/"})
public class ProductController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<String> get(@PathVariable Long id) {
//        Product product = new Product();
//        product.setName("七级滤芯净水器");
//        product.setId(1L);
//        product.setProductClass("seven_filters");
//        product.setProductId("T12345");
        return ResponseEntity.ok("al_test");
    }
}