package com.example.fridgekeeper.repository;

import com.example.fridgekeeper.entity.ConsumptionPredict;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumptionPredictRepository extends JpaRepository<ConsumptionPredict,Integer> {
}
