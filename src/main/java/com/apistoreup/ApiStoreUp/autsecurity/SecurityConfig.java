package com.apistoreup.ApiStoreUp.autsecurity;

import com.apistoreup.ApiStoreUp.UserRepository.UserRepository;
import com.apistoreup.ApiStoreUp.UserService.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SecurityConfig {

    //Bean para encriptar la contraseña para inicio de sesion
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
