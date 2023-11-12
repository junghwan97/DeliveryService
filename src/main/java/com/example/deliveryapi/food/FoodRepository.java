package com.example.deliveryapi.food;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FoodRepository {
    private Map<Integer, Food> db = new HashMap<>();
    private Integer id = 0;

    public Food selectFoodById(int id) {
        return db.get(id);
    }

    public void postFood(Food food) {
        db.put(++id,food);
    }

    public void updateFood(int id, Food food) {
        db.put(id,food);
    }

    public void deleteFood(int id) {
        db.remove(id);
    }
}
