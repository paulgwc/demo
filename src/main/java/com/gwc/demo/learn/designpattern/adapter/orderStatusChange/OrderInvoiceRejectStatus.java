package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description: 发票驳回状态
 * @author: gaowc
 * @create: 2022-03-14 15:01
 */
public class OrderInvoiceRejectStatus extends OrderStatus {

    @Override
    public void doSomethingAction(Activity activity) {
        System.out.println("走审核拒绝逻辑。。。");
        this.changeStatus(activity);
    }

    @Override
    public void changeStatus(Activity activity) {
        if (activity.getReviewType() == 1){
            //经销商审核
            this.orderStatusContext.setStatus(this.orderStatusContext.DEALER_REVIEW_INVOICE);
        }
        if (activity.getReviewType() == 2){
            //易车审核
            this.orderStatusContext.setStatus(this.orderStatusContext.YC_REVIEW_INVOICE);
        }
    }

}
