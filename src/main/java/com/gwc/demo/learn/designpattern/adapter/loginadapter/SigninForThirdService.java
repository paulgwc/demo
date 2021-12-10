package com.gwc.demo.learn.designpattern.adapter.loginadapter;

public class SigninForThirdService extends SignService{
    public ResultMsg loginForQQ(String openID){
        return loginForRegist(openID,null);
    }

    public ResultMsg loginForWechat(String openID){
        return null;
    }

    public ResultMsg loginForToken(String token){
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String userName,String password){
        super.regist(userName,null);
        return super.login(userName,null);
    }

}
