package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description: 订单到店状态
 * @author: gaowc
 * @create: 2022-03-14 14:56
 */
public class OrderToShopStatus extends OrderStatus {


    @Override
    public void doSomethingAction(Activity activity) {
        System.out.println("走到店逻辑。。。");
        this.changeStatus(activity);
    }

    @Override
    public void changeStatus(Activity activity) {
        if (activity.getUploadInvoice()){
            //待上传发票
            this.orderStatusContext.setStatus(this.orderStatusContext.UPLOAD_INVOICE);
        }else{
            this.orderStatusContext.setStatus(this.orderStatusContext.COMPLETE);
        }
    }

}
