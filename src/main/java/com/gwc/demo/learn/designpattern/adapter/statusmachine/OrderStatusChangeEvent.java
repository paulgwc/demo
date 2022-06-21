package com.gwc.demo.learn.designpattern.adapter.statusmachine;

public enum OrderStatusChangeEvent {
    // 支付，发货，确认收货
    PAYED, DELIVERY, RECEIVED;
}
