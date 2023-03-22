package com.itheima.test1;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 00};
        int left = 0, right = arr.length-1;
        int temp = 0;
        for (; left < right; left++, right--) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
