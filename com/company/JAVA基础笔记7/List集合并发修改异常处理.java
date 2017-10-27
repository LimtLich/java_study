package com.company.JAVA基础笔记7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List集合并发修改异常处理 {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        /*//常规迭代器迭代：ConcurrentModificationException（List集合并发修改异常处理）
        ListIterator lt = list.listIterator();
        while (lt.hasNext()) {
            String s = (String) lt.next();
            if (s == "world") {
                list.add("javaee");
            }
        }*/

        //for循环迭代，解决并发修改异常
        for(int x = 0;x<list.size();x++){
            if(list.get(x)=="world"){
                list.add("javaee");
            }
        }

        System.out.println(list);
    }
}
