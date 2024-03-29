package com.gwc.demo.learn.designpattern.adapter.decorator.v2;

public class SausageDecorator extends BattercakeDecorator{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething(){}

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
