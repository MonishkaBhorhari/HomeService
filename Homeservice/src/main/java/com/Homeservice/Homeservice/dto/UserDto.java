package com.Homeservice.Homeservice.dto;

import com.Homeservice.Homeservice.Enum.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private int phoneNo;
    private String password;
    private UserRole role;
}

