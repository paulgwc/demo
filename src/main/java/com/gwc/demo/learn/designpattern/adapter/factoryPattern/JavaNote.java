package com.gwc.demo.learn.designpattern.adapter.factoryPattern;

public class JavaNote implements Note{
    @Override
    public void edit() {
        System.out.println("这是java笔记");
    }
}
