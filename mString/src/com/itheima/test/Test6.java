package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String Int = sc.nextLine();
        String Out = Int.replace("TMD", "***");
        System.out.println(Out);
    }
}
