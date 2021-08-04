package com.taste.tasteeat.repo;

import com.taste.tasteeat.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IndianFoodRepository extends JpaRepository<Food, Integer> {

}