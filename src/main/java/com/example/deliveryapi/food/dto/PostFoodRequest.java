package com.example.deliveryapi.food.dto;

import com.example.deliveryapi.food.Food;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class PostFoodRequest {
    private String name;
    private Integer price;
    private String description;
    private String belong;

    // DTO를 Entity로 변환하는 메서드
    public Food toEntity() {
        return Food.builder()
                .name(this.name)
                .price(this.price)
                .description(this.description)
                .belong(this.belong)
                .build();
    }

    // Entity를 DTO로 변환하는 메서드
    public static PostFoodRequest fromEntity(Food entity) {
        return PostFoodRequest.builder()
                .name(entity.getName())
                .price(entity.getPrice())
                .description(entity.getDescription())
                .belong(entity.getBelong())
                .build();
    }
}
