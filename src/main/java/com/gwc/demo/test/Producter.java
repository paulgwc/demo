package com.gwc.demo.test;

import java.util.Queue;

public class Producter implements Runnable{

    private Queue<String> msg;
    private int maxSize;

    public Producter(Queue<String> msg, int maxSize) {
        this.msg = msg;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            i++;
            synchronized (msg){
                if (msg.size() == maxSize){
                    //消息满了
                    try {
                        msg.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者生产消息："+i);
                msg.add("生产消息："+i);
                msg.notify();//唤醒处于阻塞状态下的线程
            }
        }
    }
}
