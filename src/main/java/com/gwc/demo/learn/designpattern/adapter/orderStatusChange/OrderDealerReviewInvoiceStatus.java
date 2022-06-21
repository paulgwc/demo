package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description: 经销商审核发票状态
 * @author: gaowc
 * @create: 2022-03-14 14:58
 */
public class OrderDealerReviewInvoiceStatus extends OrderStatus {
    @Override
    public void doSomethingAction(Activity activity) {
        System.out.println("走经销商发票审核。。。。");
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
