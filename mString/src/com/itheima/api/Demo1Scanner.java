package com.itheima.api;

import java.util.Scanner;

public class Demo1Scanner {
    /*
        next(): 遇到回车就不在录入数据  结束标记：空格和tab键
        nextLine(): 可以将数据完整录入  结束标记：回车换行符
    */
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        // 调用nextLine方法接收字符串
        // 快捷键：Ctrl + alt + v 快速生成方法的返回值
        String s = sc.nextLine();
        System.out.println(s);
    }
}
