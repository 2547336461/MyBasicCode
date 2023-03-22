package com.heima.array;

import com.heima.domain.student;

public class TestObjectArray {
    public static void main(String[] args) {
        // 动态初始化长度为三的数组，类型为student
        student[] stuArray = new student[3];
        // 创建3个学生对象
        student stu1 = new student("张三", 23);
        student stu2 = new student("李四", 24);
        student stu3 = new student("王五", 25);
        // 将学生对象存入数组
        stuArray[0] = stu1;
        stuArray[1] = stu2;
        stuArray[2] = stu3;
        // 遍历数组取出学生对象
        for (int i = 0; i < stuArray.length; i++) {
            System.out.println(stuArray[i].getName() + "---" + stuArray[i].getAge());
        }
    }
}
