package com.example.deliveryapi.food;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "belong", nullable = false)
    private String belong;

    public Food(Long id, String name, Integer price, String description, String belong) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.belong = belong;
    }

    public void update(String name, Integer price, String description, String belong){
        this.name = name;
        this.price = price;
        this.description = description;
        this.belong = belong;
    }
}
