package com.itheima.test3;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(12);
        s1.setName("张三");
        System.out.println(s1.getName() + "____" + s1.getAge());
        s1.show();
    }
}

