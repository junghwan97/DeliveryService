package com.example.deliveryapi.food.dto;

import com.example.deliveryapi.food.Food;
import lombok.Getter;

@Getter
public class FoodResponse {

    private final String name;
    private final Integer price;
    private final String description;

    public FoodResponse(Food food) {
        this.name = food.getName();
        this.price = food.getPrice();
        this.description = food.getDescription();
    }
}
