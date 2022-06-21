package com.gwc.demo;

import io.netty.util.concurrent.CompleteFuture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

/**
 * @program: demo
 * @description: 多线程异步 demo
 * @author: gaowc
 * @create: 2022-04-24 09:52
 */
public class CompleteFutureTest {
    public static void main(String[] args) throws Exception {

        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU cores: " + processors);

        CompletableFuture<Boolean> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"校验活动状态通过！");
            return true;
        });
        CompletableFuture<Boolean> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"校验活动审核状态通过！");
            return true;
        });
        CompletableFuture<Boolean> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"校验下单数量通过！");
            return true;
        });
        Long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+start);
        List<CompletableFuture> list = Arrays.asList(future1,future2,future3);

        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(future1, future2, future3);
        CompletableFuture<List<Object>> listCompletableFuture = voidCompletableFuture.thenApply(v -> {
            return list.stream().map(l -> {
                try {
                    return l.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                return false;
            }).collect(Collectors.toList());
        });
        CompletableFuture<Boolean> booleanCompletableFuture = listCompletableFuture.thenApply(p -> {
            long count = p.stream().filter(a -> a.equals(false)).count();
            return count <= 0;
        });
        System.out.println(booleanCompletableFuture.get());
        Long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+end);
        System.out.println("总耗时："+(end - start));
        Thread a  = new Thread();
        a.join();
    }
}
