package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1 = sc.nextLine();
        char[] char1 = s1.toCharArray();
        for (int i = 0; i < char1.length; i++) {
            System.out.println(char1[i]);
        }
    }
}
