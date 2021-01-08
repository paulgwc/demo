package com.gwc.demo.factoryPattern.factoryMethod;

import com.gwc.demo.factoryPattern.Course;
import com.gwc.demo.factoryPattern.PythonCourse;

public class PythonCourseFactory implements CourseFactory{
    @Override
    public Course create() {
        return new PythonCourse();
    }
}
