package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description: 易车审核发票状态
 * @author: gaowc
 * @create: 2022-03-14 15:00
 */
public class OrderYcReviewInvoiceStatus extends OrderStatus {


    @Override
    public void doSomethingAction(Activity activity) {
        System.out.println("走易车发票审核。。。。");
        activity.setReviewResult(true);
        this.changeStatus(activity);
    }

    @Override
    public void changeStatus(Activity activity) {
        if (activity.getReviewResult()){
            this.orderStatusContext.setStatus(this.orderStatusContext.COMPLETE);
        }else{
            this.orderStatusContext.setStatus(this.orderStatusContext.INVOICE_REJECT);
        }
    }
}
