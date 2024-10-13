package com.Homeservice.Homeservice.dto;




import lombok.Data;

@Data
public class SignUpReqDto {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private int phoneNo;
    private String password;
}

