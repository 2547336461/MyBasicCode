package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
    }
}
