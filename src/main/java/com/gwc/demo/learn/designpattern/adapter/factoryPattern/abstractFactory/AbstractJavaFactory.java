package com.gwc.demo.learn.designpattern.adapter.factoryPattern.abstractFactory;

import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Course;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.JavaCourse;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.JavaNote;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Note;

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
