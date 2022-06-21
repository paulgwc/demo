package com.gwc.demo.learn.designpattern.adapter.statusmachine;

/**
 * @program: demo
 * @description: 订单状态
 * @author: gaowc
 * @create: 2022-03-14 17:51
 */
public enum OrderStatus {
    // 待支付，待发货，待收货，已完成
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH;
}
