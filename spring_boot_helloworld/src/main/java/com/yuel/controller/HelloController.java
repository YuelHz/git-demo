package com.yuel.controller;

import com.yuel.bean.Food;
import com.yuel.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

//    @Value("${food.rice}")
//    private String rice;
//
//    @Value("${food.meat}")
//    private String meat;
    @Autowired
    private FoodConfig foodConfig;


    @RequestMapping("/json")
    @ResponseBody
    public Food hello(){
        Food food = new Food();
        food.setMeat(foodConfig.getMeat());
        food.setRice(foodConfig.getRice());
        return food;
    }
}
