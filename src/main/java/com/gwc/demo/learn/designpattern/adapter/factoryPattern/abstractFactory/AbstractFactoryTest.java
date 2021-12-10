package com.gwc.demo.learn.designpattern.adapter.factoryPattern.abstractFactory;


public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractJavaFactory();
        abstractFactory.course().record();
        abstractFactory.edit().edit();
    }
}
