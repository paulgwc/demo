package com.gwc.demo.learn.designpattern.adapter.decorator.v2;

public abstract class BattercakeDecorator extends Battercake{
    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake){
        this.battercake = battercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
