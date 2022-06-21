package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

import com.gwc.demo.learn.designpattern.adapter.objectadapter.AC220;

/**
 * @program: demo
 * @description: 订单支付状态
 * @author: gaowc
 * @create: 2022-03-14 14:55
 */
public class OrderPayStatus extends OrderStatus {

    @Override
    public void doSomethingAction(Activity activity) {
        System.out.println("支付逻辑。。。");
        this.changeStatus(activity);
    }

    @Override
    public void changeStatus(Activity activity) {
        //判断是待到店还是 待上传发票
        if (activity.getNeedToShop()){
            //转换为到店状态
            this.orderStatusContext.setStatus(this.orderStatusContext.TO_SHOP);
        }
        if (activity.getUploadInvoice()){
            //转换为上传发票逻辑
            this.orderStatusContext.setStatus(this.orderStatusContext.UPLOAD_INVOICE);
        }
    }
}
