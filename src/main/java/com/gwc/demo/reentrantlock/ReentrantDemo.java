package com.gwc.demo.reentrantlock;

public class ReentrantDemo {
    public synchronized void demo(){
        System.out.println("begin:demo");
        demo2();
    }
    public void demo2(){
        System.out.println("begin:demo1");
        synchronized (this){
            System.out.println("begin:demo2");
        }
    }

    public static void main(String[] args) {
        ReentrantDemo rd = new ReentrantDemo();
        new Thread(rd::demo).start();
    }
}
