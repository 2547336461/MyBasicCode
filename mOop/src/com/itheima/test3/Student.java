package com.itheima.test3;

public class Student {
    // 成员变量
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 由于成员变量age和局部变量age同名，所以需要this关键字来修饰 this.age表示成员变量中的age
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 由于成员变量name和局部变量name同名，所以需要this关键字来修饰 this.name表示成员变量中的name

        this.name = name;
    }

    public void show() {
        System.out.println(name + "----" + age);
    }
}
