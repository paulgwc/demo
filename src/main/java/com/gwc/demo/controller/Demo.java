//package com.gwc.demo.controller;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
////以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
////
////        请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
////
////        示例 1：
////
////        输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
////
////        输出：[[1,6],[8,10],[15,18]]
////
////        解释：区间 [1,3] 和 [2,6]重叠, 将它们合并为 [1,6].
//public class Demo {
//
//    public static void main(String[] args) {
//        List<Object> intervals = new ArrayList<>();
//        int [] a = {1,3};
//        int [] b = {2,6};
//        int [] c = {8,10};
//        int [] d = {15,18};
//        intervals.add(a);
//        intervals.add(b);
//        intervals.add(c);
//        intervals.add(d);
//        List<Object> result = getResult(intervals);
//    }
//
//    public static List<Object> getResult(List<Object> intervals){
//        List<Object> result = new ArrayList<>();
//        if (intervals.size()<=1){
//            return result;
//        }
//        Map<Integer,Object> temp = new HashMap<>();
//        //取出数组下标
//        for (int i =0;i<intervals.size();i++){
//            temp.put(i,intervals);
//        }
//        for (int i =0;i<intervals.size();i++){
//
//        }
//
//    }
//}