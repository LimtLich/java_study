package com.company.JAVA基础笔记7;

/*
* ListIterator listIterator()：List集合特有的迭代器
* 该迭代器集成了Iterator迭代器，所以就可以直接使用hasNext()和next()方法
*
* 特有功能：
*       Object previous()：获取上一个元素
*       boolean hasPrevious()：判断是否有上一个元素
*
*       注：ListIterator可以实现逆向便利，但是必须先正向遍历，才能逆向遍历，所以一般无意义，不使用
*
* */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List特有迭代器ListIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("javaee");

        ListIterator lt = list.listIterator();
        //正向遍历
        while (lt.hasNext()) {
            String s = (String) lt.next();
            System.out.println(s);
        }
        //逆向遍历
        while (lt.hasPrevious()) {
            String s = (String) lt.previous();
            System.out.println(s);
        }

    }
}
