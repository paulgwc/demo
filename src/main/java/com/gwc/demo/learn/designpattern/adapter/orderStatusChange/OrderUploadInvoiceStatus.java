package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description: 订单上传发票状态
 * @author: gaowc
 * @create: 2022-03-14 14:57
 */
public class OrderUploadInvoiceStatus extends OrderStatus {


    @Override
    public void doSomethingAction(Activity activity) {
        System.out.println("走上传发票逻辑。。。");
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
