package com.company.JAVA基础笔记7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List存储及遍历 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");

        Iterator i = list.iterator();
        while(i.hasNext()){
            String s = (String)i.next();
            System.out.println(s);
        }
    }
}
