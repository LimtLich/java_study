package com.company.JAVA基础笔记10;

/*
* HashSet：存储字符串并遍历
*       源码解析：通过查看HashSet的add方法的源码，得知这个方法底层依赖两个方法：hashCode（）和equals（）
*
*       步骤：
*           首先比较哈希值
*           如果相同，继续走，比较地址值或走equals（）
*           如果不同，就直接添加到集合中
*
*        按照方法的步骤来说：
*           先看hashCode（）值是否相同
*           相同：继续走equals（）方法
*                   返回true：说明元素重复，就不添加
*                   返回false：说明元素不重复，就添加到集合
*           不同：就直接把元素添加到集合
*   如果类没有重写这两个方法，默认使用Object()。一般来说不会相同
*   而String类重写了hashCode（）和equals（）方法，所以，它就可以把内容相同的字符串去掉，只留下一个。
*
* */

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashSet之元素唯一性解析 {
    public static void main(String[] args) {
        //HashSet：它不保证set 的迭代顺序；特别是它不保证该顺序恒久不变
        HashSet<String> h = new HashSet<String>();
        //无序排列，唯一
        h.add("hello");
        h.add("world");
        h.add("java");
        h.add("world");
        h.add("java");
        h.add("world");
        h.add("java");

        for(String s:h){
            System.out.println(s);
        }

    }
}
