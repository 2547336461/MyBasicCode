package com.itheima.test1;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        print(arr);
    }

    public static void print(int[] Arr) {
        System.out.print("[");
        for (int i = 0; i < Arr.length; i++) {
            if (i == Arr.length - 1) {
                System.out.print(Arr[i]);
            } else {
                System.out.print(Arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
