package com.itheima.test2;

// 学生类
public class Student {
    // 成员变量
    String name;

    private int age;

    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("输入有误");
        } else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    // 成员方法
    public void show() {
        System.out.println(name + "---" + age);
    }

}
