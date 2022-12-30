package com.gwc.demo.learn.thread;
//交替打印奇偶数
public class Test {
    private static int count;
    private static final Object lock = new Object();
//    private static final int num = 100;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (lock){
                        if ((count % 2)==0){
                            System.out.println(Thread.currentThread().getName()+":"+count);
                            count++;
                        }
                    }
                }
            }
        },"偶数").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    synchronized (lock){
                        if ((count % 2)==1){
                            System.out.println(Thread.currentThread().getName()+":"+count);
                            count++;
                        }
                    }
                }
            }
        },"奇数").start();
    }
}
