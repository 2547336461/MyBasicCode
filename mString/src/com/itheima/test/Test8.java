package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        // 通过有参构造方法 将String转换为StringBuilder
        StringBuilder sb1 = new StringBuilder(str);
        sb1.reverse();
        // 通过public String toString()方法 将StringBuilder转换为String
        String strNew = sb1.toString();
        boolean a = strNew.equals(str);
        System.out.println(a);
    }
}
