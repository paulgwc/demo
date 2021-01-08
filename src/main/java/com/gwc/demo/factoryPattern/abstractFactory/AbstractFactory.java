package com.gwc.demo.factoryPattern.abstractFactory;

import com.gwc.demo.factoryPattern.Course;
import com.gwc.demo.factoryPattern.Note;

public interface AbstractFactory {
    Course course();
    Note edit();
}
