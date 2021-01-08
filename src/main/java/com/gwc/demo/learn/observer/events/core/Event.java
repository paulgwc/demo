package com.gwc.demo.learn.observer.events.core;

import java.lang.reflect.Method;

public class Event {

    private Object source;
    private Object target;
    private Method callback;
    private String trigger;
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
