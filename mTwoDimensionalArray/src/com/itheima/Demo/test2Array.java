package com.itheima.Demo;

public class test2Array {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33, 44, 55, 66}, {22, 33, 44, 55, 66, 77}, {33, 44, 55, 66, 77, 88}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
