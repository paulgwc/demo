package com.gwc.demo.learn.factoryPattern.simpleFactory;

import com.gwc.demo.learn.factoryPattern.Course;
import com.gwc.demo.learn.factoryPattern.JavaCourse;

public class FactoryTest {
    public static void main(String[] args) {
        Course course = new CourseFactory().create(JavaCourse.class);
        course.record();
    }
}
