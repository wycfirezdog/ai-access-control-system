package com.sharath.aiaccess.service;

import com.sharath.aiaccess.dto.LoginRequest;
import com.sharath.aiaccess.dto.RegisterRequest;

public interface AuthService {
 String register(RegisterRequest request);
 String login(LoginRequest request);   
} 
