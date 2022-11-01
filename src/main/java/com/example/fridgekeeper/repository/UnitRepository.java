package com.example.fridgekeeper.repository;

import com.example.fridgekeeper.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface UnitRepository extends JpaRepository<Unit, CriteriaBuilder.In> {
}
