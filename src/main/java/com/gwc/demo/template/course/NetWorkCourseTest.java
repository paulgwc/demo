package com.gwc.demo.template.course;

public class NetWorkCourseTest {
    public static void main(String[] args) {
        NetWorkCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("------------------");

        NetWorkCourse bigData = new BigDataCourse(true);
        bigData.createCourse();
    }
}
