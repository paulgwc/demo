package com.gwc.demo.learn.designpattern.adapter.stateChangePattern;

/**
 * @program: demo
 * @description:
 * @author: gaowc
 * @create: 2021-12-15 15:19
 */
public class PausedState extends PlayerState {
    public PausedState(IPlayer mPlayer) {
        super(mPlayer);
    }

    @Override
    public void handle(int action) {
        switch (action){
            case PlayerState.PLAY_OR_PAUSE:
                mPlayer.pause();
                mPlayer.setState(new PausedState(mPlayer));
                break;
            case PlayerState.STOP:
                mPlayer.stop();
                mPlayer.setState(new StoppedState(mPlayer));
                break;
            default:
                throw new IllegalArgumentException("Error Action:"+action+",current state:"+this.getClass().getSimpleName());
        }
    }
}
