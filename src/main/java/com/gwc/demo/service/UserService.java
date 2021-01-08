package com.gwc.demo.service;

import com.gwc.demo.dao.mapper.UserMapper;
import com.gwc.demo.dao.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getList(){
        return userMapper.selectList(null);
    }
}
