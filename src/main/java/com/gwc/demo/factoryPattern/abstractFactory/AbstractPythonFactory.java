package com.gwc.demo.factoryPattern.abstractFactory;

import com.gwc.demo.factoryPattern.Course;
import com.gwc.demo.factoryPattern.JavaNote;
import com.gwc.demo.factoryPattern.Note;
import com.gwc.demo.factoryPattern.PythonCourse;

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
