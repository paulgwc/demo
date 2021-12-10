package com.gwc.demo.learn.designpattern.adapter.factoryPattern.factoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory();
        courseFactory.create().record();
    }
}
