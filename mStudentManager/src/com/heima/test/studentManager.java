package com.heima.test;

import com.heima.domain.student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 创建集合容器对象
        ArrayList<student> list = new ArrayList<>();
        lo:
        while (true) {
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    addStudent(list);
                    break;
                case "2":
                    deleteStudent(list);
                    break;
                case "3":
                    reviseStudent(list);
                    break;
                case "4":
                    check(list);
                    break;
                case "5":
                    System.out.println("谢谢使用。");
                    break lo;
                default:
                    System.out.println("输入有误，请重新输入。");
            }
        }
    }

    // 修改学生信息
    public static void reviseStudent(ArrayList<student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的学生的id：");
        String sid = sc.next();
        int stuIndex = getStuIndex(list, sid);
        if (stuIndex == -1) {
            System.out.println("您要修改的学生不存在...");
        } else {
            System.out.println("请输入新的学生id：");
            String stuId = sc.next();
            System.out.println("请输入新的学生姓名：");
            String stuName = sc.next();
            System.out.println("请输入新的学生年龄：");
            int stuAge = sc.nextInt();
            System.out.println("请输入新的学生生日：");
            String stuBirthday = sc.next();
            student stuTemp = new student(stuId, stuName, stuAge, stuBirthday);
            list.set(stuIndex, stuTemp);
            System.out.println("修改成功！");
        }
    }

    // 删除学生信息
    public static void deleteStudent(ArrayList<student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的学生的id：");
        String sid = sc.next();
        int stuIndex = getStuIndex(list, sid);
        if (stuIndex == -1) {
            System.out.println("您要删除的学生不存在...");
        } else {
            list.remove(stuIndex);
            System.out.println("删除成功！");
        }
    }

    // 根据学生id找到集合中学生的索引位置
    public static int getStuIndex(ArrayList<student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (sid.equals(list.get(i).getSid())) {     //注意：使用sid.equals()方法判断是否相等
                index = i;
            }
        }
        return index;
    }

    // 查看学生信息
    public static void check(ArrayList<student> list) {
        if (list.size() == 0) {
            System.out.println("您还没有添加数据");
        } else {
            System.out.println("id\t姓名\t年龄\t生日");
            for (int i = 0; i < list.size(); i++) {
                student stuTemp = list.get(i);
                System.out.println(stuTemp.getSid() + "\t" + stuTemp.getName() + "\t" + stuTemp.getAge() + "岁\t" + stuTemp.getBirthday());
            }
        }

    }

    // 添加学生信息
    public static void addStudent(ArrayList<student> list) {
        Scanner sc = new Scanner(System.in);
        String stuId;
        while (true) {
            System.out.println("请输入学生id：");
            stuId = sc.next();
            int index = getStuIndex(list, stuId);
            if (index == -1) {
                break;
            } else {
                System.out.println("学号已存在...");
            }
        }
        System.out.println("请输入学生姓名：");
        String stuName = sc.next();
        System.out.println("请输入学生年龄：");
        int stuAge = sc.nextInt();
        System.out.println("请输入学生生日：");
        String stuBirthday = sc.next();
        student stuTemp = new student(stuId, stuName, stuAge, stuBirthday);
        boolean b = list.add(stuTemp);
        if (b) {
            System.out.println("添加成功。");
        } else {
            System.out.println("添加失败。");
        }
    }
}
