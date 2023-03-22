package com.itheima.string;

public class Demo1String {
    // java程序中所有的双引号字符串，都是String这个类的对象
    // 字符串是常量，在创建之后不能被更改
    public static void main(String[] args) {
        String s1 = "1234";
        int length = s1.length();
        System.out.println(length);

        s1 = "def";     //只是记录了新的对象 并没有更改
        System.out.println(s1);
    }
}
