package com.gwc.demo.learn.designpattern.adapter.decorator.v2;

public class EggDecorator  extends BattercakeDecorator{
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething(){}

    @Override
    protected String getMsg() {
        return super.getMsg()+"+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice()+1;
    }
}
