package com.itheima.array;

public class Demo3ArrayIndex {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // 数组初始化的时候，手动指定数组长度，系统会为数组容器自动分配初始值0
        System.out.println(arr);
        // 数组名[索引] 访问数组容器中的空间位置
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("------------");
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
