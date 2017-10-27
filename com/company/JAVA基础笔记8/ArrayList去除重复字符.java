package com.company.JAVA基础笔记8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList去除重复字符 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //创建新集合存储
        ArrayList list2 = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("world");
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add("hello");

        Iterator i = list.iterator();
        // 去重
        while (i.hasNext()) {
            String s = (String) i.next();
            // 如果没有包含，则加入新数组中
            if (!list2.contains(s)) {
                list2.add(s);
            }
        }

        //遍历去重
        for (int x = 0; x < list.size(); x++) {
            String s = (String) list.get(x);
            if (!list2.contains(s)) {
                list2.add(s);
            }
        }

        System.out.println(list2);

        System.out.println("---------原集合不变去重----------");
        ArrayList list3 = new ArrayList();
        list3.add("hello");
        list3.add("world");
        list3.add("hello");
        list3.add("world");
        list3.add("hello");
        list3.add("world");
        list3.add("world");
        list3.add("hello");

        for (int x = 0; x < list3.size() - 1; x++) {
            for (int y = x + 1; y < list3.size(); y++) {
                if (list3.get(x).equals(list3.get(y))) {
                    list3.remove(y);
                    y--;
                }
            }
        }

        System.out.println(list3);
    }
}
