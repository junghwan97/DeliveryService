package com.example.deliveryapi.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    @Autowired // 생성자가 하나만 있을 경우 생략 가능
    public FoodService (FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    public Food selectFoodById(int id) {

        return foodRepository.selectFoodById(id);
    }

    public void postFood(Food food) {
        foodRepository.postFood(food);
    }

    public void updateFood(int id, Food food) {
        foodRepository.updateFood(id, food);
    }

    public void deleteFood(int id) {
        foodRepository.deleteFood(id);
    }
}
