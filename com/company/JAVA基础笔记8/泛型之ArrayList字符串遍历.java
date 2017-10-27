package com.company.JAVA基础笔记8;

import java.util.ArrayList;
import java.util.Iterator;

public class 泛型之ArrayList字符串遍历 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hallo");
        list.add("world");
        list.add("2017");
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
