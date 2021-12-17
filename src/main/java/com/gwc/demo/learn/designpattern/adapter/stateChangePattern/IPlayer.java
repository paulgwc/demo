package com.gwc.demo.learn.designpattern.adapter.stateChangePattern;

/**
 * @program: demo
 * @description:
 * @author: gaowc
 * @create: 2021-12-10 18:55
 */
public abstract class IPlayer {
    public abstract void request(int action);
    public abstract void setState(PlayerState state);
    public abstract void playVedio();
    public abstract void pause();
    public abstract void stop();
    public abstract void showAD();
}
