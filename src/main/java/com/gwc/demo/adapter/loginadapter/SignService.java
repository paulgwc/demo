package com.gwc.demo.adapter.loginadapter;

public class SignService {

    public ResultMsg regist(String userName,String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    public ResultMsg login(String username,String password){
        return null;
    }
}
