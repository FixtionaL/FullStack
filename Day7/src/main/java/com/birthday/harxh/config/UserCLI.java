package com.birthday.harxh.config;



import static com.birthday.harxh.enumerated.Role.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.birthday.harxh.Repository.UserRepository;
import com.birthday.harxh.models.User;

import lombok.RequiredArgsConstructor;


@Component  //creating a container inside spring bean
@RequiredArgsConstructor //final key word
@SuppressWarnings("null")
public class UserCLI implements CommandLineRunner {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count()>0)
            return;
        
        var user=User.builder() //import user from usermodel
            .username("user1")
            .email("user1@gmail.com")
            .password(passwordEncoder.encode("userone"))
            .role(ADMIN)
            .build();
        
        userRepository.save(user);
        
    }

}
