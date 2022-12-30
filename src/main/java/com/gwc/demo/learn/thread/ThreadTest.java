package com.gwc.demo.learn.thread;

public class ThreadTest {

    static class ThreadPrint implements Runnable{
        private static int count = 0;
        private static final Object lock = new Object();
        private static final int num = 100;
        @Override
        public void run() {
            while (count < num){
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+":"+count);
                    count++;
                    lock.notify();
                    if (count <= num){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadPrint(),"偶数").start();
        new Thread(new ThreadPrint(),"奇数").start();
    }
}
