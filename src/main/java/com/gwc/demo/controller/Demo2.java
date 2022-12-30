package com.gwc.demo.controller;

import com.alibaba.druid.util.StringUtils;

//给定一个字符串 s ，请你找出其中不含有重复字符的最长子串的长度。
//
//
//
//        示例1:
//
//        输入: s = "abcabcbb"
//        输出: 3
//        解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
public class Demo2 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int longStr = getLongStr(s);
    }
    public static int getLongStr(String s){
        if (StringUtils.isEmpty(s)){
            return 0;
        }
        int start = 0;
        int end = 0;
        String temp = "";
        for (int i =0;i<s.length();i++){

        }
        return 0;
    }
}
