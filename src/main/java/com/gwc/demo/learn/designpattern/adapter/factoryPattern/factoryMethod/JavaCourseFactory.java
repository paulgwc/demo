package com.gwc.demo.learn.designpattern.adapter.factoryPattern.factoryMethod;

import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Course;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.JavaCourse;

public class JavaCourseFactory  implements CourseFactory{
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
