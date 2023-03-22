package com.itheima.StringMethod;

public class Demo1Equals {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        String s3 = "abc";
        System.out.println(s1.equals(s2));  // 字符串比较
        System.out.println(s1.equals(s3));

        System.out.println(s1.equalsIgnoreCase(s2));    // 字符串比较忽略大小写
    }
}
