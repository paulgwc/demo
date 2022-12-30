//package com.gwc.demo.leetcode;
//
///**
// * 快速排序
// */
//public class QuickSort {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void quickSort(int[] array){
//        if (array == null || array.length <2){
//            return;
//        }
//        quickSort(array,0,array.length-1);
//    }
//
//    public static void quickSort(int[] array,int l,int r){
//        if (l >= r){
//            return;
//        }
//        int num = array[r];
//        int[] index = quickSort(array,l,r,num);
//        quickSort(array,l,index[0]);
//        quickSort(array,index[1],r);
//    }
//
////    public static int[] quickSort(int[] array,int l,int r,int num){
////
////    }
//}
