package com.gwc.demo.learn.factoryPattern.factoryMethod;

import com.gwc.demo.learn.factoryPattern.Course;
import com.gwc.demo.learn.factoryPattern.JavaCourse;

public class JavaCourseFactory  implements CourseFactory{
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
