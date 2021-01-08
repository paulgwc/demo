package com.gwc.demo;


import java.util.concurrent.locks.ReentrantLock;

public class VolatileDemo {
    public volatile static  boolean stop = false;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            int i = 0;
            while(!stop){
                i++;
//                System.out.println("i++"+i);
            }
        });
        thread.start();
        System.out.println("begin start thread");
        Thread.sleep(1000);
        stop = true;
    }
}
