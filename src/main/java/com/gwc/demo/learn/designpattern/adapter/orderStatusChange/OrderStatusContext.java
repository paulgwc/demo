package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

/**
 * @program: demo
 * @description: 订单状态 上下文
 * @author: gaowc
 * @create: 2022-03-14 14:41
 */
public class OrderStatusContext {

    public static final OrderStatus PAY = new OrderPayStatus();
    public static final OrderStatus TO_SHOP = new OrderToShopStatus();
    public static final OrderStatus UPLOAD_INVOICE = new OrderUploadInvoiceStatus();
    public static final OrderStatus DEALER_REVIEW_INVOICE = new OrderDealerReviewInvoiceStatus();
    public static final OrderStatus YC_REVIEW_INVOICE = new OrderYcReviewInvoiceStatus();
    public static final OrderStatus INVOICE_REJECT = new OrderInvoiceRejectStatus();
    public static final OrderStatus COMPLETE = new OrderCompleteStatus();

    private OrderStatus currentStatus = PAY;

    {
        PAY.setOrderStatusContext(this);
        TO_SHOP.setOrderStatusContext(this);
        UPLOAD_INVOICE.setOrderStatusContext(this);
        DEALER_REVIEW_INVOICE.setOrderStatusContext(this);
        YC_REVIEW_INVOICE.setOrderStatusContext(this);
        INVOICE_REJECT.setOrderStatusContext(this);
        COMPLETE.setOrderStatusContext(this);
    }


    public void setStatus(OrderStatus status){
        this.currentStatus = status;
    }

    public void doSomething(Activity activity){
        this.currentStatus.doSomethingAction(activity);
    }
}
