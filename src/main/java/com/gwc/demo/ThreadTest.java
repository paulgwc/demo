package com.gwc.demo;

/**
 * @program: demo
 * @description: 交替打印线程
 * @author: gaowc
 * @create: 2022-06-21 13:38
 */
public class ThreadTest {

    public static final Object lock = new Object();
    public static int count = 0;
    public static void main(String[] args) {
        new Thread(()->{
            while(count < 100){
                synchronized (lock){
                    if (count %2 ==1){
                        System.out.println(Thread.currentThread()+"打印奇数"+count);
                        count++;
                    }
                }
            }

        }).start();

        new Thread(()->{
            while(count < 100){
                synchronized (lock){
                    if (count %2 ==0){
                        System.out.println(Thread.currentThread()+"打印偶数"+count);
                        count++;
                    }
                }
            }
        }).start();
    }

}
