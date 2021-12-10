package com.gwc.demo.learn.designpattern.adapter.factoryPattern.abstractFactory;

import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Course;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Note;

public interface AbstractFactory {
    Course course();
    Note edit();
}
