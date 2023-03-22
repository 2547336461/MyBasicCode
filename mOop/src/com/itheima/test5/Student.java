package com.itheima.test5;

public class Student {
    private String name;
    private int age;

    // 构造方法
    // 利用重载机制 构造多个构造方法满足不同情况
    public Student() {
        System.out.println("这是Student类的无参构造方法");
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println(name + "----" + age);
    }
}
