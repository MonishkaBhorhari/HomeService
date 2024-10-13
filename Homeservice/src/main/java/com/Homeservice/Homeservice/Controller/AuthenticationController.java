package com.Homeservice.Homeservice.Controller;


import com.Homeservice.Homeservice.Services.authantication.AuthService;
import com.Homeservice.Homeservice.dto.SignUpReqDto;
import com.Homeservice.Homeservice.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthService authService;

    @PostMapping("/company/sign-up")
    public ResponseEntity<?> signupClient(@RequestBody SignUpReqDto signUpReqDto) {
        if (authService.presentByEmail(signUpReqDto.getEmail())) {
            return new ResponseEntity<>("Client already exists", HttpStatus.NOT_ACCEPTABLE);
        }
        UserDto createdUser = authService.signupClient(signUpReqDto);
        return new ResponseEntity<>(createdUser, HttpStatus.OK);
    }
}
