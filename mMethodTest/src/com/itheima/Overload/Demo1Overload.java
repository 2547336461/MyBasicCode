package com.itheima.Overload;

public class Demo1Overload {
    public static void main(String[] args) {
        byte a = 12;
        byte b = 13;
        if (IsEqual(a,b)) {
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }

    public static boolean IsEqual(int a, int b) {
        return a == b;
    }

    public static boolean IsEqual(byte a, byte b) {
        return a == b;
    }

    public static boolean IsEqual(short a, short b) {
        return a == b;
    }

    public static boolean IsEqual(long a, long b) {
        return a == b;
    }
}
