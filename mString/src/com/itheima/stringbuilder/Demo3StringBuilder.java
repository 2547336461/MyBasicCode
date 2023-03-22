package com.itheima.stringbuilder;

public class Demo3StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb0 = new StringBuilder();
        StringBuilder sb1 = sb0.append("红色");
        StringBuilder sb2 = sb1.append("绿色");
        StringBuilder sb3 = sb2.append("黄色");
        System.out.println(sb0);

        sb0.append(123).append(456).append(789);    //链式编程：如果一个方法返回值是对象类型，对象就可以一直向下调用方法
        System.out.println(sb0);

        System.out.println("反转前：" + sb0);
        sb0.reverse();  //反转方法
        System.out.println("反转后：" + sb0);
        System.out.println("sb0中的字符个数："+ sb0.length());

        String str = sb0.toString();    // 转换为String
        System.out.println(str);


    }
}
