package com.itheima.method2;

public class Demo1Method {
    public static void main(String[] args) {
        print(3, 100);
    }

    public static void print(int n, int m) {
        System.out.println(n + "到" + m + "之间的所有奇数：");
        for (int i = n; i <= m; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
