package com.itheima.test1;

import java.util.Scanner;

public class Test4Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 34, 54, 5, 6, 7, 8, 9, 10, 24, 53};
        System.out.println("请输入你要查找的数值：");
        int num = sc.nextInt(), index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("未找到该数值。");
        } else {
            System.out.println("该数值的索引位置为：" + index);
        }
    }
}
