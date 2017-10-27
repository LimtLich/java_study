package com.company.JAVA基础笔记8;

/*
* public static <T> List<T> asList(T... a)：把数组转成集合
*
*   注：
*       虽然可以把数组转成集合，但是集合长度不能改变，因其本质仍是数组，长度固定
* */

import java.util.Arrays;
import java.util.List;

public class Arrays工具类asList方法 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "javaee");
        //list.add("java")//报错，长度不可改变
        //list.remove(1);

        list.set(2, "java");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
