package com.gwc.demo.controller;
//有序的数组中找到某一目标值首次出现的下标
public class FindIndex {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        int targetIndex = findTargetIndex2(array, 100);
        System.out.println(targetIndex);
    }
    public static int findTargetIndex(int[]array,int target){
        if (array == null || array.length ==0){
            return -1;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        if (array[right]<target){
            return -1;
        }
        while(left<right){
            int mid = (left+right)/2;
            if (array[mid]<target){
                left = mid+1;
            }else {
                right = mid;
            }
        }
        if (array[right] == target){
            return right;
        }else {
            return -1;
        }
    }

    public static int findTargetIndex2(int[] array,int target){
        if (array == null || array.length == 0){
            return -1;
        }
        int left = 0;
        int right = array.length -1;
        if (array[right]<target){
            return -1;
        }
        while (left < right){
            int mid = (left + right) /2;
            if (array[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        if (array[right] == target){
            return right;
        }else{
            return -1;
        }
    }
}
