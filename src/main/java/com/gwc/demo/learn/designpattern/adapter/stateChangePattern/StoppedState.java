package com.gwc.demo.learn.designpattern.adapter.stateChangePattern;

/**
 * @program: demo
 * @description:
 * @author: gaowc
 * @create: 2021-12-15 15:20
 */
public class StoppedState extends PlayerState {
    public StoppedState(IPlayer mPlayer) {
        super(mPlayer);
    }

    @Override
    public void handle(int action) {
        switch(action){
            case PlayerState.PLAY_OR_PAUSE:
                mPlayer.pause();
                mPlayer.setState(new PausedState(mPlayer));
                break;
            default:
                throw new IllegalArgumentException("Error Action:"+action+",current state:"+this.getClass().getSimpleName());
        }
    }
}
