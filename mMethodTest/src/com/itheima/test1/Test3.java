package com.itheima.test1;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 6, 7, 8, 78, 99};
        int[] Mm = new int[2];
        GetMm(arr, Mm);
        System.out.println("最大值为：" + Mm[0] + "\n最小值为：" + Mm[1]);
    }

    public static void GetMm(int[] arr, int[] Mm) {
        Mm[0] = arr[0];
        Mm[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > Mm[0]) {
                Mm[0] = arr[i];
            }
            if (arr[i] < Mm[1]) {
                Mm[1] = arr[i];
            }
        }
    }
}
