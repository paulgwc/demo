package com.gwc.demo.learn.designpattern.adapter.decorator;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg{
    protected String getMsg(){
        return super.getMsg() + "+1根香肠";
    }

    public int getPrice(){
        return super.getPrice()+2;
    }
}
