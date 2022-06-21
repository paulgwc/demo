package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description:订单完成状态
 * @author: gaowc
 * @create: 2022-03-14 15:01
 */
public class OrderCompleteStatus extends OrderStatus{


    @Override
    public void doSomethingAction(Activity activity) {
        System.out.println("走订单完成逻辑");
        this.changeStatus(activity);
    }

    @Override
    public void changeStatus(Activity activity) {

    }

}
