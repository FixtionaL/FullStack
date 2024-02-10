package com.birthday.harxh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birthday.harxh.dto.response.BasicResponse;
import com.birthday.harxh.dto.response.FoodMenuResponse;
import com.birthday.harxh.service.FoodMenuService;

@RestController
@RequestMapping("/admin")
public class FoodMenuController {

    private final FoodMenuService foodMenuService;

    public FoodMenuController(FoodMenuService foodMenuService) {
        this.foodMenuService = foodMenuService;
    }

    @GetMapping("/getAllFoodMenus")
    public BasicResponse<FoodMenuResponse> getAllFoodMenus() {
        return foodMenuService.getAllFoodMenus();
    }
    // Can add more endpoints for adding, editing, and deleting food menus as needed
}