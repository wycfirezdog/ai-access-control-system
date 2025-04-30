package com.sharath.aiaccess.service.impl;

import com.sharath.aiaccess.dto.LoginRequest;
import com.sharath.aiaccess.dto.RegisterRequest;
import com.sharath.aiaccess.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String register(RegisterRequest request) {
        // TODO: Logic to save user
        return "Registered!";
    }

    @Override
    public String login(LoginRequest request) {
        // TODO: Validate and return JWT
        return "Token!";
    }
}
