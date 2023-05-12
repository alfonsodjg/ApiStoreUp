package com.apistoreup.ApiStoreUp.UserController;

import com.apistoreup.ApiStoreUp.UserModel.UserModel;
import com.apistoreup.ApiStoreUp.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@RestController
@RequestMapping
public class UserController {
    private static final Logger logger=LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @RequestMapping(value = "api/getUsers",method = RequestMethod.GET)
    public ArrayList<UserModel> userModels(){
        return  userService.getUsers();
    }
    @RequestMapping(value = "api/StoreUp/registerUser", method = RequestMethod.POST)
    public void addUser(@RequestBody UserModel user) {
        this.userService.addUser(user);
    }

    //Endpoint para logear usuario
    @RequestMapping(value = "api/login",method = RequestMethod.POST)
    public ResponseEntity<String> login(@RequestBody UserModel userModel){
        logger.info("Attempting login for email: {}", userModel.getEmail());
        if(userService.authentication(userModel.getEmail(),userModel.getPassword())){
            logger.info("Login successful for email: {}", userModel.getEmail());
            return ResponseEntity.ok("Login successful");
        }else{
            logger.warn("Invalid login attempt for email: {}", userModel.getEmail());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
