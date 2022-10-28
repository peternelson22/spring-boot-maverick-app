package com.nelson.springbootmaverick.service;

import com.nelson.springbootmaverick.dto.AuthenticationResponse;
import com.nelson.springbootmaverick.dto.LoginRequest;
import com.nelson.springbootmaverick.dto.RegisterRequest;

public interface AuthService {

    void signup(RegisterRequest registerRequest);

    void verifyAccount(String token);

    AuthenticationResponse login(LoginRequest loginRequest);
}
