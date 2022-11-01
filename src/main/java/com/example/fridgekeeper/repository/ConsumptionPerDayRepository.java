package com.example.fridgekeeper.repository;

import com.example.fridgekeeper.entity.ConsumptionPerDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumptionPerDayRepository extends JpaRepository<ConsumptionPerDay,Integer> {
}
