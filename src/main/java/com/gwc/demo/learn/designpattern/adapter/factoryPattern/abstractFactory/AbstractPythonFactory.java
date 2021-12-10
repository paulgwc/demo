package com.gwc.demo.learn.designpattern.adapter.factoryPattern.abstractFactory;

import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Course;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.JavaNote;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Note;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.PythonCourse;

public class AbstractPythonFactory implements AbstractFactory{
    @Override
    public Course course() {
        return new PythonCourse();
    }

    @Override
    public Note edit() {
        return new JavaNote();
    }
}
