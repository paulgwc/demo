package com.gwc.demo;

/**
 * @program: demo
 * @description: 线程交替打印
 * @author: gaowc
 * @create: 2022-06-20 14:29
 */
public class ThreadTest {
    public static int count;
    public static final Object lock = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <10000){
                    synchronized (lock){
                        if (count %2 ==1){
                            System.out.println(Thread.currentThread().getName()+"打印奇数"+count);
                            count++;
                        }
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count <10000){
                    synchronized (lock){
                        if (count %2 ==0){
                            System.out.println(Thread.currentThread().getName()+"打印偶数"+count);
                            count++;
                        }
                    }
                }

            }
        }).start();
    }
}
