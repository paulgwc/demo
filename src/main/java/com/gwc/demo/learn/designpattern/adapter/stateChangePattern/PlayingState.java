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
        switch(action){
            case PlayingState.PLAY_OR_PAUSE:
                mPlayer.pause();
                mPlayer.setState(new PausedState(mPlayer));
                break;
            case PlayingState.STOP:
                mPlayer.stop();
                mPlayer.setState(new StoppedState(mPlayer));
                break;
            default:
                throw new IllegalArgumentException("Error Action:"+action+",current state:"+this.getClass().getSimpleName());
        }
    }
}

