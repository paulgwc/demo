package com.gwc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
//    @AuthorAnnotion()
    @RequestMapping("/demo")
    public void test(){
        System.out.println("这是一个测试接口！");
        String a = null;
        a.toString();
//        DingDingMessageUtil.sendTextMessage("测试！");
    }
}
