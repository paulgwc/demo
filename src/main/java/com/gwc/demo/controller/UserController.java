package com.gwc.demo.controller;

import com.gwc.demo.dao.pojo.User;
import com.gwc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getList")
    public List<User> getList(){
      return userService.getList();
    }
}
