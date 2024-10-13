package com.Homeservice.Homeservice.Services.authantication;


import com.Homeservice.Homeservice.dto.SignUpReqDto;
import com.Homeservice.Homeservice.dto.UserDto;

public interface AuthService {
    UserDto signupClient(SignUpReqDto signUpReqDto);
    Boolean presentByEmail(String email);
}
