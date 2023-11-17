package com.example.deliveryapi.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FoodService {

    private final FoodJpaRepository foodJpaRepository;

    @Autowired // 생성자가 하나만 있을 경우 생략 가능
    public FoodService (FoodJpaRepository foodJpaRepository){
        this.foodJpaRepository = foodJpaRepository;
    }

    public FoodDTO selectFoodById(int id) {
        Optional<Food> food = foodJpaRepository.findById(id);
        return FoodDTO.fromEntity(food.orElse(null));
    }

    public void postFood(FoodDTO dto) {
        Food food = dto.toEntity();
        foodJpaRepository.save(food);
    }

    public void updateFood(int id, FoodDTO dto) {
        Food food = dto.toEntity();
        foodJpaRepository.save(food);
    }

    public void deleteFood(int id) {
        foodJpaRepository.deleteById(id);
    }
}