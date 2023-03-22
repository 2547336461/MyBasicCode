package com.itheima.test;

public class Test9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String str = arrayToString(array);
        System.out.println(str);
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]).append("]");
            } else {
                sb.append(array[i]).append(",");
            }

        }
        String str = sb.toString();
        return str;
    }
}
