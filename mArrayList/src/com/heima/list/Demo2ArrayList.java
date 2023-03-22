package com.heima.list;

import java.util.ArrayList;

public class Demo2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("111");
        // 返回指定索引位置的元素值
        String s1 = list.get(0);
        String s2 = list.get(1);
        String s3 = list.get(2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        // 返回集合中的元素个数
        int size = list.size();
        System.out.println(size);

    }

    private static void testSet() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("111");
        String s = list.set(0, "zzz");
        System.out.println(list);
        System.out.println(s);
    }

    private static void testRemove() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("111");

        System.out.println(list);
        // 删除指定元素 返回是否成功
        boolean b1 = list.remove("aaa");
        boolean b2 = list.remove("zzz");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(list);
        // 删除索引位置元素 返回被删除元素
        String s = list.remove(0);
        System.out.println(s);
        System.out.println(list);
    }
}
