package com.birthday.harxh.service.impl;

import static com.birthday.harxh.enumerated.Role.USER;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.birthday.harxh.Repository.UserRepository;
import com.birthday.harxh.dto.request.LoginRequest;
import com.birthday.harxh.dto.request.RegisterRequest;
import com.birthday.harxh.dto.response.LoginResponse;
import com.birthday.harxh.dto.response.RegisterResponse;
import com.birthday.harxh.models.User;
import com.birthday.harxh.service.AuthenticationService;
import com.birthday.harxh.utils.JwtUtil;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@SuppressWarnings("null")
public class AuthenticationServiceImpl implements AuthenticationService {
    

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;


    @Override
    public RegisterResponse register(RegisterRequest request) {
        Optional<User> isUserExists=userRepository.findByEmail(request.getEmail());
        if (isUserExists.isPresent()) {
            return RegisterResponse.builder().message("user with mail id"+request.getEmail()+" is already registered").build();
        }

        var user=User.builder()
        .username(request.getUsername())
        .email(request.getEmail())
            .password(passwordEncoder.encode(request.getPassword()))
            .role(USER)
            .build();
        userRepository.save(user);

        return RegisterResponse.builder().message("User Created successfully").build();
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        var user=userRepository.findByEmail(request.getEmail()).orElseThrow();
        String token=jwtUtil.generateToken(user);
        return LoginResponse.builder()
            .message("User Login Successfully")
            .token(token)
            .build();
    }

}

