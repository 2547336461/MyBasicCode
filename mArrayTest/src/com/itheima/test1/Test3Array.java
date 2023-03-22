package com.itheima.test1;

import java.util.Scanner;

public class Test3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个整数：");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        double average = 0;
        for (int i = 0; i < 5; i++) {
            sum += (arr[i]);
        }
        average = sum / 5.012;
        System.out.println("平均数为：" + average);
    }
}
