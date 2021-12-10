package com.gwc.demo.learn.designpattern.adapter.factoryPattern.factoryMethod;

import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Course;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.PythonCourse;

public class PythonCourseFactory implements CourseFactory{
    @Override
    public Course create() {
        return new PythonCourse();
    }
}
