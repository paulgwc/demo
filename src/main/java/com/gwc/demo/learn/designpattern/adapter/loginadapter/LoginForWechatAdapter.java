package com.gwc.demo.learn.designpattern.adapter.loginadapter;

public class LoginForWechatAdapter implements LoginAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
