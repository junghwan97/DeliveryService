package com.example.deliveryapi.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodJpaRepository extends JpaRepository<Food, Long> {

}
