package com.example.fridgekeeper.repository;

import com.example.fridgekeeper.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,String> {
}
