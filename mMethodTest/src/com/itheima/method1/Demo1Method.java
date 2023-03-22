package com.itheima.method1;

public class Demo1Method {
    public static void main(String[] args) {
        eat();
        study();
    }

    // 方法与方法之间是平级关系，不可以嵌套定义
    public static void eat() {
        System.out.println("吃饭");
        study();
    }

    public static void study() {
        System.out.println("学习");
    }
}
