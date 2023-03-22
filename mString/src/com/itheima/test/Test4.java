package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int Capital = 0, LowerCase = 0, Number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1 = sc.nextLine();
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 'A' && chars[i] < 'Z') {
                Capital++;
            } else if (chars[i] > 'a' && chars[i] < 'z') {
                LowerCase++;
            } else if (chars[i] > '0' && chars[i] < '9') {
                Number++;
            }
        }
        System.out.println("大写：" + Capital + "\n小写：" + LowerCase + "\n数字：" + Number);
    }
}
