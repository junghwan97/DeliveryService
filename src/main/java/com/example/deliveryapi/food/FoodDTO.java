package com.example.deliveryapi.food;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FoodDTO {
    private String name;
    private int price;
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
    public static FoodDTO fromEntity(Food entity) {
        return FoodDTO.builder()
                .name(entity.getName())
                .price(entity.getPrice())
                .description(entity.getDescription())
                .belong(entity.getBelong())
                .build();
    }
}
