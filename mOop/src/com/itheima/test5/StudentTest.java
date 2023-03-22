package com.itheima.test5;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("老王");
        s2.show();

        Student s3 = new Student(23);
        s3.show();

        Student s4 = new Student("张三", 24);
        s4.show();
    }

}
