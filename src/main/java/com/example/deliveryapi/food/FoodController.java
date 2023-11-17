package com.example.deliveryapi.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/foods/{id}")
    public FoodDTO selectFood(@PathVariable("id") int id) {
        FoodDTO dto = foodService.selectFoodById(id);
        return dto;
    }

    // 사장님 권한만 실행 가능
    @PostMapping("/foods")
    public void postFood(FoodDTO dto) {
        foodService.postFood(dto);
    }

    // 사장님 권한만 실행 가능
    @PutMapping("/foods/{id}")
    public void updateFood(@PathVariable("id") int id, FoodDTO dto) {
        foodService.updateFood(id, dto);
    }

    // 사장님 권한만 실행 가능
    @DeleteMapping("/foods/{id}")
    public void deleteFood(@PathVariable("id") int id) {
        foodService.deleteFood(id);
    }

}