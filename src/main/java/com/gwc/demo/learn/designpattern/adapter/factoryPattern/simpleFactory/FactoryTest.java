package com.gwc.demo.learn.designpattern.adapter.factoryPattern.simpleFactory;

import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Course;
import com.gwc.demo.learn.designpattern.adapter.factoryPattern.JavaCourse;

public class FactoryTest {
    public static void main(String[] args) {
        Course course = new CourseFactory().create(JavaCourse.class);
        course.record();
    }
}
