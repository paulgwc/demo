package com.gwc.demo.learn.designpattern.adapter.stateChangePattern;

/**
 * @program: demo
 * @description:
 * @author: gaowc
 * @create: 2021-12-15 15:40
 */
public class VideoPlayer extends IPlayer {

    private PlayerState mState = new StoppedState(this);
    @Override
    public void request(int action) {
        System.out.println("before action:"+mState.toString());
        mState.handle(action);
        System.out.println("after action:"+mState.toString());
    }

    @Override
    public void setState(PlayerState state) {
        mState = state;
    }

    @Override
    public void playVedio() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void showAD() {

    }
}
