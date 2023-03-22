package com.itheima.stringbuilder;

public class Demo1StringBuilder {
    public static void main(String[] args) {
        method();
        method2();
    }

    private static void method2() {
        long start = System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < 500000; i++) {
            s2.append(i);
        }
//        System.out.println(s2);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void method() {
        long start = System.currentTimeMillis();
        String s1 = "";
        for (int i = 0; i < 500000; i++) {
            s1 += i;
        }
//        System.out.println(s1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
