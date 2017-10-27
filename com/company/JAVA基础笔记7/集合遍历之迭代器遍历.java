package com.company.JAVA基础笔记7;

/*
* Iterator iterator()：迭代器，集合的专用遍历方式
*       Object next()：获取元素，并移动到下一个位置
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 集合遍历之迭代器遍历 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator i = c.iterator();//子类对象 new Itr
        //while遍历(结构清晰，建议使用)
        while(i.hasNext()){
            String s = (String)i.next();
            System.out.println(s);
        }
        System.out.println("---------------------------");
        //for循环改写遍历（使用完后便成为垃圾被回收，效率高）
        for(Iterator i2 = c.iterator();i2.hasNext();){
            String s = (String)i2.next();//向下转型
            System.out.println(s);
        }
    }
}
