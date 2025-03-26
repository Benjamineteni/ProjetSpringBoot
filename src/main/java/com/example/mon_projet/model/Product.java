package com.example.mon_projet.model;




import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class Product {



    private String id;
    private String name;
    private String description;
    private int quantity;
    private Double price;
    private LocalDate expiryDate;
    public LocalDate getExpiryDate() {
        return expiryDate;
    }



}
