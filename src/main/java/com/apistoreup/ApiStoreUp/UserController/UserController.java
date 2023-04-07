package com.apistoreup.ApiStoreUp.UserController;

import com.apistoreup.ApiStoreUp.UserModel.UserModel;
import com.apistoreup.ApiStoreUp.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "api/getUsers",method = RequestMethod.GET)
    public ArrayList<UserModel> userModels(){
        return  userService.getUsers();
    }
    @RequestMapping(value = "api/addUser", method = RequestMethod.POST)
    public void addUser(@RequestBody UserModel user){
        this.userService.addUser(user);
    }
}
