package com.gwc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
//    @AuthorAnnotion()
    @RequestMapping("/demo")
    public String test(){
        return "这是第二个测试jenkins的代码";
    }
}
