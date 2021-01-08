package com.gwc.demo.learn.factoryPattern.abstractFactory;

import com.gwc.demo.learn.factoryPattern.Course;
import com.gwc.demo.learn.factoryPattern.Note;

public interface AbstractFactory {
    Course course();
    Note edit();
}
