package com.gwc.demo.learn.designpattern.adapter.statusmachine;


/**
 * @program: demo
 * @description: 订单类
 * @author: gaowc
 * @create: 2022-03-14 17:51
 */
public class Order {
    private int id;
    private OrderStatus status;
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "订单号：" + id + ", 订单状态：" + status;
    }
}
