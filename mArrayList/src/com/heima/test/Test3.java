package com.heima.test;

import com.heima.domain.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<student>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生的姓名：");
            String stuNameTemp = sc.next();
            System.out.println("请输入第" + (i + 1) + "位学生的年龄：");
            int stuAgeTemp = sc.nextInt();
            student stuTemp = new student(stuNameTemp, stuAgeTemp);
            list.add(stuTemp);
        }
        for (int i = 0; i < list.size(); i++) {
            student stuTemp = list.get(i);
            System.out.println(stuTemp.getName() + "----" + stuTemp.getAge());
        }


    }
}
