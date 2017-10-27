package com.company.JAVA基础笔记7;

public class List三个子类的特点 {
    /*
    * List子类特点：
    *       ArrayList：
    *           底层数据结构是数组，查询快，增删慢
    *           非同步，线程不安全，效率高
    *       Vector：
    *           底层数据结构是数组，查询快，增删慢
    *           同步，线程安全，效率低
    *       LinkedList：
    *           底层数据结构是链表，查询慢，增删快
    *           不同步，线程不安全，效率高
    *
    *   选用分析：
    *       安全性要求：
    *           高：Vector（即使对安全性有要求，也不用这个，后面有替代的）
    *           低：ArrayList 或者 LinkedList
    *               查询多：ArrayList
    *               增删多：LinkedList
    *
    *            常规：ArrayList
    * */
}
