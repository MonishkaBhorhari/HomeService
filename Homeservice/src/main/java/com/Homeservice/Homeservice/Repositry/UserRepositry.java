package com.Homeservice.Homeservice.Repositry;



import com.Homeservice.Homeservice.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends JpaRepository<User, Long> {
   User findFirstByEmail(String email);
}
