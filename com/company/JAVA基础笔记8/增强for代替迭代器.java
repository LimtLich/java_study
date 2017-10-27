package com.company.JAVA基础笔记8;

/*
* 增强for：是for循环的一种
*
* 格式：
*       for（元素数据类型 变量：数组或者Collection集合）{
*           使用变量即可，该变量就是元素
*       }
*
* 好处：简化了数组和集合的遍历
*
* 弊端：增强for的目标不能为null，在之前需要做非null判断
* */

import java.util.ArrayList;
import java.util.Collection;

public class 增强for代替迭代器 {
    public static void main(String[] args) {
        //增加for遍历数组
        int[] arr = {1, 3, 5, 7, 9};
        for (int a : arr) {
            System.out.println(a);
        }

        System.out.println("------增强for遍历集合---------");
        //增强for遍历集合
        Collection<String> c = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");

        if (c != null) {
            for (String s : c) {
                System.out.println(s);
            }
        }

        System.out.println("---------等同迭代器检测---------");
        //增强for其实是用来替代迭代器的，以下实现同样会导致并发修改异常
        /*for(String s:c){
            if(s.equals("world")){
                c.add("javaee");
            }
        }
        System.out.println(c);*/
    }
}
