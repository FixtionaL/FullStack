package com.birthday.harxh.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FoodMenuResponse {
    private Long id;
    private String name;
    private String description;
    private double price;
}
