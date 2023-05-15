package com.apistoreup.ApiStoreUp.services;

import com.apistoreup.ApiStoreUp.models.UserModel;
import com.apistoreup.ApiStoreUp.repositorys.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public ArrayList<UserModel> getUsers() {
        return (ArrayList<UserModel>) userRepository.findAll();
    }

    //Metodo para agregar usuario, encriptamos la contraseña
    public void addUser(UserModel user) {
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
    }

    //Metodo para autenticar el usuario en inicio de sesion
    public boolean authentication(String email, String password) {
        UserModel userModel = userRepository.findByEmail(email);
        if (userModel != null) {
            String encodedPassword = userModel.getPassword();
            boolean match = passwordEncoder.matches(password, encodedPassword);
            if (match) {
                logger.info("Authentication successful for email: {}", email);
            } else {
                logger.warn("Invalid password for email: {}", email);
            }
            return match;
        } else {
            logger.warn("User not found for email: {}", email);
            return false;
        }
    }
}
