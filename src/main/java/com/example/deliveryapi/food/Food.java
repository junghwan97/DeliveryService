package com.example.deliveryapi.food;


public class Food {

    int id;
    String name;
    int price;
    String description;
    String belong;

    public Food(int id, String name, int price, String description, String belong) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.belong = belong;
    }
}
