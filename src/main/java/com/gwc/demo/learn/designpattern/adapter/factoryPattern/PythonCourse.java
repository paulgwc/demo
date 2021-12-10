package com.gwc.demo.learn.designpattern.adapter.factoryPattern;

public class PythonCourse implements Course {
    @Override
    public void record() {
        System.out.println("这是python");
    }
}
