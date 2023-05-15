package com.apistoreup.ApiStoreUp.controllers;

import com.apistoreup.ApiStoreUp.autsecurity.AuthResponse;
import com.apistoreup.ApiStoreUp.autsecurity.AuthResponseAdmi;
import com.apistoreup.ApiStoreUp.models.UserAdmiModel;
import com.apistoreup.ApiStoreUp.services.UserAdmiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class UserAdmiController {

    @Autowired
    UserAdmiService userAdmiService;

    @RequestMapping(value = "api/getUsers/admi",method = RequestMethod.GET)
    public ArrayList<UserAdmiModel> getAlluserAdmi(){
        return userAdmiService.getAllUsers();
    }
    @RequestMapping(value = "api/inserUser/admi",method = RequestMethod.POST)
    public void inserUserAdmi(@RequestBody UserAdmiModel userAdmiModel){
        this.userAdmiService.insertUserAdmi(userAdmiModel);
    }
    @RequestMapping(value = "api/loginAdmi", method = RequestMethod.POST)
    public ResponseEntity<AuthResponseAdmi> loginAdmi(@RequestBody UserAdmiModel userAdmiModel){
        if(userAdmiService.autenticationAdmi(userAdmiModel.getEmail(),userAdmiModel.getPassword())){
            AuthResponseAdmi authResponseAdmi=new AuthResponseAdmi();
            authResponseAdmi.setName(userAdmiModel.getName());
            authResponseAdmi.setSuccess(true);
            authResponseAdmi.setMessage("Login successful");
            return ResponseEntity.ok(authResponseAdmi);
        }else{
            AuthResponseAdmi authResponseAdmi=new AuthResponseAdmi();
            authResponseAdmi.setSuccess(false);
            authResponseAdmi.setMessage("invalid credentials");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(authResponseAdmi);
        }
    }
}
