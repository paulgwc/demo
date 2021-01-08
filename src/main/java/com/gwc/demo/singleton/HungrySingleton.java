package com.gwc.demo.singleton;
//hungrySinglton
public class HungrySingleton {
    private static final HungrySingleton hungrySingeton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingeton;
    }

}
