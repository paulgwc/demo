package com.gwc.demo.learn.adapter.loginadapter;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
