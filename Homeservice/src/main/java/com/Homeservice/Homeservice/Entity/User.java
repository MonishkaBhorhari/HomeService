package com.Homeservice.Homeservice.Entity;


import com.Homeservice.Homeservice.Enum.UserRole;
import com.Homeservice.Homeservice.dto.UserDto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private int phoneNo;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    public UserDto getDto() {
        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setName(name);
        userDto.setLastName(lastName);
        userDto.setEmail(email);
        userDto.setRole(role);
        return userDto;
    }
}
