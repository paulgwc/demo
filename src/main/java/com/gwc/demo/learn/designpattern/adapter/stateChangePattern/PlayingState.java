package com.gwc.demo.learn.designpattern.adapter.stateChangePattern;

/**
 * @program: demo
 * @description:
 * @author: gaowc
 * @create: 2021-12-10 19:05
 */
public class PlayingState extends PlayerState {

    public PlayingState(IPlayer mPlayer) {
        super(mPlayer);
    }

    @Override
    public void handle(int action) {

    }
}
