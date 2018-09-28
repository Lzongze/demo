package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
//用户Dao
@Repository(value="userDao")
@Mapper
public interface IUserDao {
    //查询所有用户信息
    //
    List<User> selectAll();
}
