package com.example.springboot.dao;

import com.example.springboot.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
public interface UserMapper {
    @Select("select * from user")
    List<User> allInfo();

    int delUser(int id);
}
