package com.gwc.demo.factoryPattern.factoryMethod;

import com.gwc.demo.factoryPattern.Course;
import com.gwc.demo.factoryPattern.JavaCourse;

public class JavaCourseFactory  implements CourseFactory{
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
