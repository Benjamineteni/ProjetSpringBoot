package com.example.mon_projet.Controller;

import com.example.mon_projet.model.product;
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
    public product addProduct(@RequestBody product product) {

        String id = UUID.randomUUID().toString();
        product.setId(id);

        return product;
    }
}