package com.example.fridgekeeper.repository;

import com.example.fridgekeeper.entity.BuyingFood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyingFoodRepository extends JpaRepository<BuyingFood,Integer> {
}
