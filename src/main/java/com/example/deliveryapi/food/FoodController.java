package com.example.deliveryapi.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    @GetMapping("/foods/{id}")
    public Food selectFood(@PathVariable("id") int id){
        return foodService.selectFoodById(id);
    }

    // 사장님 권한만 실행 가능
    @PostMapping("/foods")
    public void postFood(Food food){
        foodService.postFood(food);
    }

    // 사장님 권한만 실행 가능
    @PutMapping("/foods/{id}")
    public void updateFood(@PathVariable("id") int id, Food food){
        foodService.updateFood(id, food);
    }

    // 사장님 권한만 실행 가능
    @DeleteMapping("/foods/{id}")
    public void deleteFood(@PathVariable("id") int id){
        foodService.deleteFood(id);
    }

}
