package com.itheima.test;

import com.itheima.domain.student;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息：");
        String s1 = sc.nextLine();
        String[] strArray = s1.split("，");  //  根据‘，’切割字符串 返回一个字符串数组
        student st1 = new student(strArray[0], strArray[1]);
        System.out.println(st1.getName() + "-----" + st1.getAge());
    }
}
