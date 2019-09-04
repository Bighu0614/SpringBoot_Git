package com.example.springboot.controller;

import com.example.springboot.dao.UserMapper;
import com.example.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper udao;
    @RequestMapping("/list")
    public ModelAndView showInfo(ModelAndView model){
        List<User> users = udao.allInfo();
        model.addObject("userList",users);
        model.setViewName("userlist");
        return model;

    }
    @RequestMapping("/del")
    public String delUser(){
        udao.delUser(15);
        return "userlist";
    }
}
