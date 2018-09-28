package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UsersController {
    @Resource(name="userService")
    private IUserService userService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public List<User> say(){
        List<User> users = userService.selectAll();
        return users;
    }
}
