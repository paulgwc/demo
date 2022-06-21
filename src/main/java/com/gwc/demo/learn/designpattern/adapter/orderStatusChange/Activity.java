package com.gwc.demo.learn.designpattern.adapter.orderStatusChange;

import lombok.Data;

/**
 * @program: demo
 * @description: 活动
 * @author: gaowc
 * @create: 2022-03-14 16:13
 */
@Data
public class Activity {

    private Long id;
    private Boolean needToShop;
    private Boolean uploadInvoice;
    //1 经销商审核 2 易车审核
    private Integer reviewType;

    private Boolean reviewResult;
}
