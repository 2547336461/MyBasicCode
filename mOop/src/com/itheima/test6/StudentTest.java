package com.itheima.test6;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(24);
        s1.setName("张三");
        System.out.println(s1.getName() + "...." + s1.getAge());
        s1.show();
        Student s2 = new Student("李四", 25);
        s2.show();
    }
}
