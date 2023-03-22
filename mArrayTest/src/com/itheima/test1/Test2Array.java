package com.itheima.test1;

public class Test2Array {
    public static void main(String[] args) {
        int[] arr = {112, 314, 5, 68, 5, 9, 865432, 363, 2};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max:" + max);
    }
}
