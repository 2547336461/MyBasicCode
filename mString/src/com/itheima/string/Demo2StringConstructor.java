package com.itheima.string;

public class Demo2StringConstructor {
    public static void main(String[] args) {
        //  创建空白字符串 不含有任何内容
        String s1 = new String();
        System.out.println(s1); // 打印对象名 并不会输出地址 而是真是数据
        // 根据字符数组内容来创建字符串对象
        char[] chs = {'a', 'b', 'c', 'd'};
        String s2 = new String(chs);
        System.out.println(s2);
        String s3 = new String("123456");
        System.out.println(s3);
    }
}
