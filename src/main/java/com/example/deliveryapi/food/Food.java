package com.example.deliveryapi.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Integer price;
    private String description;
    private String belong;

    public Food(int id, String name, Integer price, String description, String belong) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.belong = belong;
    }

    public Food() {

    }
}
