package com.gwc.demo.factoryPattern.simpleFactory;

import com.gwc.demo.factoryPattern.Course;
import com.gwc.demo.factoryPattern.JavaCourse;

public class FactoryTest {
    public static void main(String[] args) {
        Course course = new CourseFactory().create(JavaCourse.class);
        course.record();
    }
}
