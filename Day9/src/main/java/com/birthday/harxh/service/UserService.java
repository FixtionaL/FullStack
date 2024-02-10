package com.birthday.harxh.service;

import com.birthday.harxh.dto.response.BasicResponse;
import com.birthday.harxh.dto.response.UserResponse;

public interface UserService {

    BasicResponse<UserResponse> getAllUser();

}