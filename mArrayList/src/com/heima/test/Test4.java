package com.heima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("abc");
        list.add("test");
        list.add("cde");
        list.add("test");
        list.add("test");
        list.add("def");
        list.add("test");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("test".equals(s)) {
                list.remove(i);

                i--; // 回滚一下 保证全部删除
            }
        }
        System.out.println(list);
    }
}
