package com.itheima.method1;

public class Demo2Method {
    public static void main(String[] args) {
        int a = IsOdd(111);
        if(a == 1){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
    public static int IsOdd(int a){
        if(a%2 == 0){
            return 1;
        }else {
            return 0;
        }
    }
}
