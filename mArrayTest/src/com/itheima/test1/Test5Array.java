package com.itheima.test1;

import java.util.Scanner;

public class Test5Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        double result;
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + (i + 1) + "个分数：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
            }else{
                System.out.println("成绩无效请重新输入：");
                i--;    // 成绩无效后 可以控制指针重新数组
            }
        }
        int max = arr[0], min = arr[0], sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        result = (sum - max - min) / 4.0;
        System.out.println("最终结果为：" + result);
    }
}
