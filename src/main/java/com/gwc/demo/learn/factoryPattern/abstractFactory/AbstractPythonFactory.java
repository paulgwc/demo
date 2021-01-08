package com.gwc.demo.learn.factoryPattern.abstractFactory;

import com.gwc.demo.learn.factoryPattern.Course;
import com.gwc.demo.learn.factoryPattern.JavaNote;
import com.gwc.demo.learn.factoryPattern.Note;
import com.gwc.demo.learn.factoryPattern.PythonCourse;

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
