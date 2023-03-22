package com.itheima.test1;

public class Test1Array {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 12, 121, 2, 34, 4, 214,};
        // 数组的遍历
        for (int i = 0; i < 9; i++) {
            System.out.println(arr[i]);
        }
        // 动态获取数组元素的个数： 数组名.length
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
