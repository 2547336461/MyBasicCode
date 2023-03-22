package com.itheima.api;

import java.util.Scanner;

public class Demo2Scanner {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int i = sc.nextInt();
        //输入 10 + 回车时：nextInt 接收10，nextLine 接收回车
        //导致nextLine直接结束
        System.out.println("请输入字符串：");
        //String s = sc.nextLine();
        // 字符串和数字一起接收时建议使用next()方法接收字符串
        String s = sc.next();

        System.out.println(i);
        System.out.println(s);
    }
}
