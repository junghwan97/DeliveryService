package com.example.deliveryapi.food;

import com.example.deliveryapi.food.dto.FoodResponse;
import com.example.deliveryapi.food.dto.PostFoodRequest;
import com.example.deliveryapi.food.dto.UpdateFoodRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public ResponseEntity<List<FoodResponse>> findAllFoods(){
        List<FoodResponse> foods = foodService.findAll()
                .stream()
                .map(FoodResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(foods);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodResponse> findById(@PathVariable("id") long id) {
        Food food = foodService.findById(id);
        return ResponseEntity.ok()
                .body(new FoodResponse(food));
    }

    // 사장님 권한만 실행 가능
    @PostMapping
    public ResponseEntity<Food> postFood(@RequestBody PostFoodRequest dto) {
        Food postFood = foodService.postFood(dto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(postFood);
    }

    // 사장님 권한만 실행 가능
    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable("id") long id, @RequestBody UpdateFoodRequest request) {
        Food updateFood = foodService.update(id, request);

        return ResponseEntity.ok()
                .body(updateFood);
    }

    // 사장님 권한만 실행 가능
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFood(@PathVariable("id") long id) {
        foodService.deleteFood(id);

        return ResponseEntity.ok()
                .build();
    }

}