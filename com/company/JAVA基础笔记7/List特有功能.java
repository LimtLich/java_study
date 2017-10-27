package com.company.JAVA基础笔记7;

/*
* List集合特有功能:
*       A:添加功能
*           void add(int index,Object element)：在指定位置添加元素
*       B:获取功能
*           Object get(int index)：获取指定位置的元素
*       C:列表迭代器
*           ListIterator listIterator()：List集合特有的迭代器
*       D:删除功能
*           Object remove(int index)：根据索引删除元素，返回被删除的元素
*       E:修改功能
*           Object set(int index,Object element)：根据索引修改元素，返回被修饰的元素
* */

import java.util.ArrayList;
import java.util.List;

public class List特有功能 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");

        list.add(2, "java");//可临界加入
        //list.add(3,"hi");//错误，越界

        System.out.println("list.get():" + list.get(2));

        System.out.println("list.remove():" + list.remove(2));

        System.out.println("list.set():" + list.set(1, "javaee"));
        //System.out.println("list.set():" + list.set(2, "javaee"));//错误，越界

        System.out.println("------------使用get()做list特有遍历----------------");

        list.add("javase");

        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }

        System.out.println(list);

    }
}
