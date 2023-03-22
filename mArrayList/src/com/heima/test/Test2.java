package com.heima.test;

import com.heima.domain.student;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<student>();
        student st1 = new student("张三", 23);
        student st2 = new student("李四", 24);
        student st3 = new student("王五", 25);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        for (int i = 0; i < list.size(); i++) {
            student stuTemp = list.get(i);
            System.out.println(stuTemp.getName() + "----" + stuTemp.getAge());
        }
    }
}
