package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description:
 * @author: gaowc
 * @create: 2022-03-14 17:05
 */
public class Test {
    public static void main(String[] args) {
        Activity activity = new Activity();
        activity.setNeedToShop(true);
        activity.setUploadInvoice(true);
        activity.setReviewType(1);
        OrderStatusContext context = new OrderStatusContext();
        context.doSomething(activity);
    }
}
