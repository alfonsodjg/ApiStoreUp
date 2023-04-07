package com.apistoreup.ApiStoreUp.UserService;

import com.apistoreup.ApiStoreUp.UserModel.UserModel;
import com.apistoreup.ApiStoreUp.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    public void addUser(@RequestBody UserModel user){
        userRepository.save(user);
    }
}
