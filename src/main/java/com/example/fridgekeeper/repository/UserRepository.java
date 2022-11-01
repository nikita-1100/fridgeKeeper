package com.example.fridgekeeper.repository;

import com.example.fridgekeeper.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
