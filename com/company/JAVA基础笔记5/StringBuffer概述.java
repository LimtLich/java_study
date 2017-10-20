package com.company.JAVA基础笔记5;

/*
* StringBuffer:
*           线程安全的可变字符串
* StringBuffer和String的区别：前者长度和内容可变，后者不可变
*           注：使用StringBuffer做字符串拼接，不会浪费太多资源
*
* StringBuffer构造方法：
*           public StringBuffer()：无参构造方法
*           public StringBuffer(int capacity)：指定容量的字符串缓冲区对象
*           public StringBuffer(String str)：指定字符串内容的字符串缓冲区对象
* */

public class StringBuffer概述 {
    public static void main(String[] args) {
        //StringBuffer可以理解为制造一个缓冲区（一个可以装水的水杯）
        StringBuffer sb = new StringBuffer();
        System.out.println("sb:"+sb);//为空，所以已重写toString()方法
        System.out.println("sb.capacity():"+sb.capacity());//默认容量值为16
        System.out.println("sb.length():"+sb.length());//0

        System.out.println("--------------------------------");
        StringBuffer sb2 = new StringBuffer(50);//指定容量
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.capacity():"+sb2.capacity());//容量给定为50
        System.out.println("sb2.length():"+sb2.length());

        System.out.println("--------------------------------");
        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println("sb3:"+sb3);//输出指定字符串值
        System.out.println("sb3.capacity():"+sb3.capacity());//容量为：默认容量（16）+字符长度（5）= 21
        System.out.println("sb3.length():"+sb3.length());//字符长度为5
    }
}
