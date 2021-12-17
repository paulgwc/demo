package com.gwc.demo.learn.designpattern.adapter.stateChangePattern;

/**
 * @program: demo
 * @description:
 * @author: gaowc
 * @create: 2021-12-10 18:57
 */
public abstract class PlayerState {
    public final static int PLAY_OR_PAUSE = 0;
    public final static int STOP = 1;
    protected IPlayer mPlayer;

    public PlayerState(IPlayer mPlayer) {
        this.mPlayer = mPlayer;
    }

    public abstract void handle(int action);

    @Override
    public String toString() {
        return "current state:" + this.getClass().getSimpleName();
    }
}
