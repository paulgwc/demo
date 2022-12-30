package com.gwc.demo.controller;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthString {

    public static void main(String[] args) {
        int maxLengthString = getMaxLengthString("abcabcbb");
        System.out.println(maxLengthString);
    }

    public static int getMaxLengthString(String str){
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left  = 0;
        for (int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                left = Math.max(left,map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
