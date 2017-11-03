package com.company.JAVA基础笔记10;

import java.util.TreeSet;

public class TreeSet保证元素排序源码解析 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(8);
        t.add(2);
        t.add(0);
        //自动排序
        //真正比较的是依赖于元素的compareTo()方法，而这个方法是定义在Comparable里面的
        //所以，要想重写该方法，就必须实现Comparable接口，这个接口表示的就是自然排序
        for (Integer i : t) {
            System.out.println(i);
        }
    }
}
