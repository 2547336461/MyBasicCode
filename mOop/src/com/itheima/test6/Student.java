package com.itheima.test6;

public class Student {
    private String name;
    private int age;

    // 构造方法
    public Student() {
        // 无参
    }

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + "____" + age);
    }
}
