package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

import afu.org.checkerframework.checker.oigj.qual.O;

/**
 * @program: demo
 * @description: 订单状态类
 * @author: gaowc
 * @create: 2022-03-14 14:43
 */
public abstract class OrderStatus {
    protected OrderStatusContext orderStatusContext;

    public void setOrderStatusContext(OrderStatusContext orderStatusContext){
        this.orderStatusContext = orderStatusContext;
    }

    //订单流程 待支付 -》 支付-》到店-》上传发票-》发票审核-》 发票驳回

    //具体操作方法
    public abstract void doSomethingAction(Activity activity);
    //改变状态
    public abstract void changeStatus(Activity activity);


}
