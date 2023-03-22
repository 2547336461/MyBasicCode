package com.itheima.test1;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,};
        int max = GetMax(arr);
        System.out.println(max);
    }

    public static int GetMax(int[] Arr) {
        int max = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }
        return max;
    }
}
