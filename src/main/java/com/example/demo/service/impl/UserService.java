package com.example.demo.service.impl;

import com.example.demo.dao.IUserDao;
import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value="userService")
public class UserService implements IUserService {
    @Resource(name="userDao")
    IUserDao IUserDao;
    @Override
    public List<User> selectAll() {
        return IUserDao.selectAll();
    }
}
