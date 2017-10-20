package com.company.JAVA基础笔记5;

/*
* 1：String，StringBuffer，StringBuilder的区别？
*   A：String是内容不可变的，StringBuffer，StringBuilder都是内容可变的
*   B：StringBuffer是同步的，数据安全，效率低，StringBuilder是不同步的，数据不安全（在多线程模式下），效率较高
*   C：常用模式为单线程模式，推荐使用StringBuilder
*
* 2：StringBuffer和数组的区别？
*   A：二者都可以看作是容器，装载其它数据类型
*   B:StringBuffer不论装入什么数据类型，最终返回的都是字符串
*   C：数组可以放置多种数据，但必须是同一种数据类型
*
* 3：形式参数问题
*   A：String作为参数传递
*   B：StringBuffer作为参数传递
*
*   形式参数：
*       基本类型：形式参数的改变不影响实际参数
*       引用类型：形式参数的改变直接影响实际参数
*
*       注：String作为参数传递，效果和基本类型作为参数传递是一样的
* */

public class StringBuffer面试题 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "-----" + s2);
        change(s1, s2);//String的值是作为常量存储在内存中，所以形参的改变不会影响实际参数
        System.out.println(s1 + "--------" + s2);

        System.out.println("-----------------------");
        StringBuffer sb = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb + "----------" + sb2);
        changeB(sb, sb2);//StringBuffer常量值通过调用操作方法会受到改变，直接 = 号赋值不会改变
        System.out.println(sb + "----------" + sb2);
    }

    public static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
    }

    public static void changeB(StringBuffer sb, StringBuffer sb2) {
        //直接赋值内容不变，做操作时内容改变
        // 一般不使用 = 号直接进行更改，而是使用append
        sb = sb2;
        sb2.append(sb);
    }


}
