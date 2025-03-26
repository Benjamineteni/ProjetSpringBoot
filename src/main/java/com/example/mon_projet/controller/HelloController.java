package com.example.mon_projet.controller;

import com.example.mon_projet.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;

@RestController
@RequestMapping("/api")
public class HelloController{

    @GetMapping("/hello")
    public String sayhello(){
        return "hello word";
    }


    @PostMapping("/create-product")

    public ResponseEntity<Product>addProduct(@RequestBody Product product) {

        String id = UUID.randomUUID().toString();
        product.setId(id);

        return ResponseEntity.ok(product);
    }

}