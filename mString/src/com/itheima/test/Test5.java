package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        String beginStr = s1.substring(0, 3);
        String endStr = s1.substring(7);
        System.out.println(beginStr + "****" + endStr);
    }
}
