package com.birthday.harxh.service;



import com.birthday.harxh.dto.request.LoginRequest;
import com.birthday.harxh.dto.request.RegisterRequest;
import com.birthday.harxh.dto.response.LoginResponse;
import com.birthday.harxh.dto.response.RegisterResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

}
