package com.gwc.demo.learn.designpattern.adapter.factoryPattern;

public class PythonNote implements Note{
    @Override
    public void edit() {
        System.out.println("这是Python笔记");
    }
}
