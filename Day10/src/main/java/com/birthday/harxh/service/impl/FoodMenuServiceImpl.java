package com.birthday.harxh.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.birthday.harxh.Repository.FoodMenuRepository;
import com.birthday.harxh.dto.response.BasicResponse;
import com.birthday.harxh.dto.response.FoodMenuResponse;
import com.birthday.harxh.models.FoodMenu;
import com.birthday.harxh.service.FoodMenuService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class FoodMenuServiceImpl implements FoodMenuService {
    private final FoodMenuRepository foodMenuRepository;

@Override
    public BasicResponse<FoodMenuResponse> getAllFoodMenus() {
        List<FoodMenu> foodMenus = foodMenuRepository.findAll();

        // Stream used to convert list to objects
        List<FoodMenuResponse> foodMenuResponses = foodMenus.stream()
                .map(foodMenu -> FoodMenuResponse.builder()
                        .id(foodMenu.getId())
                        .name(foodMenu.getName())
                        .description(foodMenu.getDescription())
                        .price(foodMenu.getPrice())
                        // Add more attributes as needed
                        .build())
                .collect(Collectors.toList());

        return BasicResponse.<FoodMenuResponse>builder()
                .message("Food menus data fetched successfully")
                .data(foodMenuResponses)
                .build();
    }
}
