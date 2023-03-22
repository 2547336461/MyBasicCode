package com.heima.test;

import com.heima.domain.student;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<student>();
        student stu1 = new student("张三1", 17);
        student stu2 = new student("张三2", 16);
        student stu3 = new student("张三3", 15);
        student stu4 = new student("张三4", 19);
        student stu5 = new student("张三5", 20);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "---" + list.get(i).getAge());
        }
        System.out.println("-------");
        ArrayList<student> newList = getLessThan18(list);
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i).getName() + "---" + newList.get(i).getAge());
        }
    }

    private static ArrayList<student> getLessThan18(ArrayList<student> list) {
        ArrayList<student> listTemp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() < 18) {
                listTemp.add(list.get(i));
            }
        }
        return listTemp;
    }
}
