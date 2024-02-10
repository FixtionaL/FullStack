package com.birthday.harxh.service;

import com.birthday.harxh.dto.response.BasicResponse;
import com.birthday.harxh.dto.response.FoodMenuResponse;

public interface FoodMenuService {
    BasicResponse<FoodMenuResponse> getAllFoodMenus();
    // Add more methods as needed
}
