package com.example.deliveryapi.food;

import com.example.deliveryapi.food.dto.PostFoodRequest;
import com.example.deliveryapi.food.dto.UpdateFoodRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FoodService {

    private final FoodJpaRepository foodJpaRepository;

    @Autowired // 생성자가 하나만 있을 경우 생략 가능
    public FoodService(FoodJpaRepository foodJpaRepository) {
        this.foodJpaRepository = foodJpaRepository;
    }

    public List<Food> findAll(){
        return foodJpaRepository.findAll();
    }

    public Food findById(long id){
        return foodJpaRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("not found : " + id));
    }

    public Food postFood(PostFoodRequest dto) {
        Food food = dto.toEntity();
        return foodJpaRepository.save(food);
    }

    @Transactional
    public Food update(long id, UpdateFoodRequest request){
        Food food = foodJpaRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("not found" + id));

        food.update(request.getName(), request.getPrice(), request.getDescription(), request.getBelong());
        return food;
    }

    public void deleteFood(long id) {
        foodJpaRepository.deleteById(id);
    }
}