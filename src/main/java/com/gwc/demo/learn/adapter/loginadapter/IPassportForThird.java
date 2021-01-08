package com.gwc.demo.learn.adapter.loginadapter;

public interface IPassportForThird {
    ResultMsg loginForQQ(String id);
    ResultMsg loginForWechat(String id);
    ResultMsg loginForToken(String token);
    ResultMsg loginForTelPhone(String telphone,String code);
    ResultMsg loginForRegist(String username,String passport);
}
