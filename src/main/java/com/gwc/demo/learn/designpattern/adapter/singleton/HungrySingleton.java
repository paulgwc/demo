package com.gwc.demo.learn.designpattern.adapter.singleton;
//hungrySinglton
public class HungrySingleton {
    private static final HungrySingleton hungrySingeton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingeton;
    }

}
