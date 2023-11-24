package com.example.deliveryapi.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateFoodRequest {
    private String name;
    private Integer price;
    private String description;
    private String belong;
}
