package com.gwc.demo.factoryPattern.simpleFactory;

import com.gwc.demo.factoryPattern.Course;

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
