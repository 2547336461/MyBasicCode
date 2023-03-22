package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String Ac = "admin", Pw = "admin123";
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号：");
            String Account = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if (Ac.equals(Account) && Pw.equals(password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("登录失败，您已经没有机会。");
                } else {
                    System.out.println("账号或密码错误请重新输入(你还有" + (2 - i) + "次机会)");
                }
            }
        }
    }
}
