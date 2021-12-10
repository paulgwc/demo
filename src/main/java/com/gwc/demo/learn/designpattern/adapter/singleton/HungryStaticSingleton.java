package com.gwc.demo.learn.designpattern.adapter.singleton;
//hungrySingleton
public class HungryStaticSingleton {
    private  static final HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}
    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
