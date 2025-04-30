package com.sharath.aiaccess.controller;

import com.sharath.aiaccess.dto.LoginRequest;
import com.sharath.aiaccess.dto.RegisterRequest;
import com.sharath.aiaccess.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor

public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest request){
        return authService.register(request);
    }
    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request){
        return authService.login(request);
    }
    
}
