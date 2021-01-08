package com.gwc.demo.learn.factoryPattern.abstractFactory;

import com.gwc.demo.learn.factoryPattern.Course;
import com.gwc.demo.learn.factoryPattern.JavaCourse;
import com.gwc.demo.learn.factoryPattern.JavaNote;
import com.gwc.demo.learn.factoryPattern.Note;

public class AbstractJavaFactory implements AbstractFactory{

    @Override
    public Course course() {
        return new JavaCourse();
    }

    @Override
    public Note edit() {
        return new JavaNote();
    }
}
