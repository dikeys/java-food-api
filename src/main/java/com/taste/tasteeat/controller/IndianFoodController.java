package com.taste.tasteeat.controller;

import com.taste.tasteeat.Entity.Food;
import com.taste.tasteeat.repo.IndianFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class IndianFoodController {

    @Autowired
    private IndianFoodRepository indianFoodRepository;

    @GetMapping(path = "/foods")
    @ResponseBody
    public List<Food> getAllFood(){
        return indianFoodRepository.findAll();
    }

    @GetMapping(path = "/unique")
    @ResponseBody
    public Optional<Food> getFoodById(@RequestParam Integer id){
        return indianFoodRepository.findById(id);
    }

    @PostMapping(path="/add")
    public Food addNewUser (@RequestBody Food food) {
        System.out.println(food);
        return indianFoodRepository.save(food);
    }

    @DeleteMapping(path = "/delete")
    public void deleteFood(@RequestParam Integer id){
        indianFoodRepository.deleteById(id);
    }
}
