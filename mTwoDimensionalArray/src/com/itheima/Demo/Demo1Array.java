package com.itheima.Demo;

public class Demo1Array {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(arr);  //地址：[[I@10f87f48
        // 二维数组存储一维数组时，存的是一维数组的地址
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);

        // 向二维数组中存储数据
        arr[0][0] = 111;
        arr[0][1] = 222;
        arr[0][2] = 333;
        arr[1][0] = 111;
        arr[1][1] = 222;
        arr[1][2] = 333;
        arr[2][0] = 111;
        arr[2][1] = 222;
        arr[2][2] = 333;

        // 向二维数组中读取数据并打印
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

    }
}
