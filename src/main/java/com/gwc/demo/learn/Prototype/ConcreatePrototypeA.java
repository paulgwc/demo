package com.gwc.demo.learn.Prototype;

import java.util.List;

public class ConcreatePrototypeA implements Prototype{
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcreatePrototypeA concreatePrototype = new ConcreatePrototypeA();
        concreatePrototype.setAge(this.age);
        concreatePrototype.setName(this.name);
        concreatePrototype.setHobbies(this.hobbies);
        return concreatePrototype;
    }
}
