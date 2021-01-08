package com.gwc.demo.learn.factoryPattern.factoryMethod;

import com.gwc.demo.learn.factoryPattern.Course;
import com.gwc.demo.learn.factoryPattern.PythonCourse;

public class PythonCourseFactory implements CourseFactory{
    @Override
    public Course create() {
        return new PythonCourse();
    }
}
