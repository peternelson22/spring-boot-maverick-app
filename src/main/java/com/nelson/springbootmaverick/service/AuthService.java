package com.nelson.springbootmaverick.service;

import com.nelson.springbootmaverick.dto.RegisterRequest;

public interface AuthService {

    void signup(RegisterRequest registerRequest);
}
