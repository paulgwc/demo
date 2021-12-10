package com.gwc.demo.learn.designpattern.adapter.loginadapter;

public interface LoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
