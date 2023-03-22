package com.itheima.test2;

public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        Student s1 = new Student();
        // 给成员变量赋值
        s1.name = "张三";
        s1.setAge(12);
        // 调用show方法
        s1.show();
    }
}
