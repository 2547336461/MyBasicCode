package com.itheima.test4;

public class Student {
    private String name;
    private int age;

    // 构造方法：
    // 1.方法名和类名相同(大小写一致)
    // 2.没有返回值类型void也没有
    // 3.没有具体的返回值
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是student类的构造方法中的代码》》》");
    }

    public void show() {
        System.out.println(name + "_____" + age);
    }
}
