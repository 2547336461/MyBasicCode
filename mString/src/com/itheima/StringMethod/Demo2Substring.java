package com.itheima.StringMethod;

public class Demo2Substring {
    public static void main(String[] args) {
        String s1 = "itheima";
        String substring = s1.substring(2);   //从传入的索引位置开始截取一直到末尾。
        System.out.println(substring);
        String substring1 = s1.substring(0, 2);         //从beginIndex开始截取，一直到endIndex结束 (包含头不包含尾)
        System.out.println(substring1);
    }
}
