package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

//用户Service
public interface IUserService {
    //查询所有用户信息
    List<User> selectAll();
}
