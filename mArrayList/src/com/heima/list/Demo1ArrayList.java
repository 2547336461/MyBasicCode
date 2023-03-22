package com.heima.list;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo1ArrayList {
    // ArrayList<E>:可调节大小的数组实现
    // <E>: 泛型，对集合容器的储存类型进行限制， 没有添加<>表示可以存储任意数据类型
    public static void main(String[] args) {
        // 1.创建集合容器对象
        ArrayList<String> list = new ArrayList();
        // 2.调用对象的add方法，将指定元素追加到集合末尾
        list.add("a");
        list.add("b");
        list.add("c");
        // 在此集合的指定位置追加指定元素
        list.add(0, "d");
        System.out.println(list);
    }
}
