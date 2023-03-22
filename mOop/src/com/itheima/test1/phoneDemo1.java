package com.itheima.test1;

public class phoneDemo1 {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();
        // 使用成员变量
        System.out.println(p.name);
        System.out.println(p.prise);
        p.name = "xiaomi";
        p.prise = 1999;
        System.out.println(p.name);
        System.out.println(p.prise);
        // 使用成员方法
        p.call();
        p.sendMessage();
    }
}
