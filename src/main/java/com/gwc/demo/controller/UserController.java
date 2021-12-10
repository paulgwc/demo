package com.gwc.demo.controller;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import com.gwc.demo.dao.pojo.User;
import com.gwc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getList")
    public List<User> getList(){
      return userService.getList();
    }

    public static void main(String[] args) {
        BloomFilter<CharSequence> bloomFilter = BloomFilter.create(Funnels.stringFunnel(Charset.forName("utf-8")),3,0.001);
        bloomFilter.put("123");
        bloomFilter.put("123");
        bloomFilter.put("123");
        System.out.println(bloomFilter.mightContain("121"));
    }
}
