package com.Homeservice.Homeservice.Services.authantication;



import com.Homeservice.Homeservice.Entity.User;
import com.Homeservice.Homeservice.Enum.UserRole;
import com.Homeservice.Homeservice.Repositry.UserRepositry;
import com.Homeservice.Homeservice.dto.SignUpReqDto;
import com.Homeservice.Homeservice.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImp implements AuthService {

    @Autowired
    private UserRepositry userRepositry;

    @Override
    public UserDto signupClient(SignUpReqDto signUpReqDto) {
        User user = new User();
        user.setName(signUpReqDto.getName());
        user.setLastName(signUpReqDto.getLastName());
        user.setEmail(signUpReqDto.getEmail());
        user.setPassword(signUpReqDto.getPassword());
        user.setPhoneNo(signUpReqDto.getPhoneNo());
        user.setRole(UserRole.CLIENT);
        return userRepositry.save(user).getDto();
    }

    @Override
    public Boolean presentByEmail(String email) {
        return userRepositry.findFirstByEmail(email) != null;
    }
}
