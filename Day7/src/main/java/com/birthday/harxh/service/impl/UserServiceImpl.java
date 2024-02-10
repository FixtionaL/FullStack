package com.birthday.harxh.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.birthday.harxh.Repository.UserRepository;
import com.birthday.harxh.dto.response.BasicResponse;
import com.birthday.harxh.dto.response.UserResponse;
import com.birthday.harxh.models.User;
import com.birthday.harxh.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository rep;

    @Override
    public BasicResponse<UserResponse> getAllUser() {

        List<User>users=rep.findAll();

        // stream used to convert list to obj
        List<UserResponse> userresp =users.stream().map(user->UserResponse.builder()
        .id(user.getId())
        .username(user.getUsername())
        .email(user.getEmail())
        .role(user.getRole())
        .build())
        .collect(Collectors.toList());

        return BasicResponse.<UserResponse>builder()
        .message("user data fetched successfully")
        .data(userresp)
        .build();      
    }  
}