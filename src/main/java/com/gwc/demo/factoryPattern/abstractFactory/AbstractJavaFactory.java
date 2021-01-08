package com.gwc.demo.factoryPattern.abstractFactory;

import com.gwc.demo.factoryPattern.Course;
import com.gwc.demo.factoryPattern.JavaCourse;
import com.gwc.demo.factoryPattern.JavaNote;
import com.gwc.demo.factoryPattern.Note;

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
