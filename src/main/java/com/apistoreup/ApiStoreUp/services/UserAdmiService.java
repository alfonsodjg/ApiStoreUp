package com.apistoreup.ApiStoreUp.services;

import com.apistoreup.ApiStoreUp.models.UserAdmiModel;
import com.apistoreup.ApiStoreUp.repositorys.UserAdmiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class UserAdmiService {

    @Autowired
    UserAdmiRepository userAdmiRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    public ArrayList<UserAdmiModel> getAllUsers(){
        return (ArrayList<UserAdmiModel>) userAdmiRepository.findAll();
    }
    public void insertUserAdmi(@RequestBody UserAdmiModel userAdmiModel){
        userAdmiModel.setPassword(passwordEncoder.encode(userAdmiModel.getPassword()));
        userAdmiRepository.save(userAdmiModel);
    }
    public boolean autenticationAdmi(String email,String password){
        UserAdmiModel userAdmiModel=userAdmiRepository.findByEmail(email);
        if(userAdmiModel!=null){
            String encodePassword=userAdmiModel.getPassword();
            return passwordEncoder.matches(password,encodePassword);
        }else{
            return false;
        }
    }
}
