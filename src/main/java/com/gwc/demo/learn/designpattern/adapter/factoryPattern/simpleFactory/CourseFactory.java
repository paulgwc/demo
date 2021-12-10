package com.gwc.demo.learn.designpattern.adapter.factoryPattern.simpleFactory;

import com.gwc.demo.learn.designpattern.adapter.factoryPattern.Course;

public class CourseFactory {
    public Course create(Class<? extends Course> clazz){
        try{
            if (clazz!= null){
                return clazz.newInstance();
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
