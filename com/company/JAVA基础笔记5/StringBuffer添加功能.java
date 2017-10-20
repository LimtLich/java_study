package com.company.JAVA基础笔记5;

/*
* public StringBuffer append(String str)：可以吧任意类型数据添加到字符串缓冲区里面，并返回字符串缓冲区本身
*
* public StringBuffer insert()：在指定位置把任意类型的数据插入到字符串缓冲区里面
* */

public class StringBuffer添加功能 {
    public static void main(String[] args) {
        //创建缓冲区对象
        StringBuffer sb = new StringBuffer();
        //追加数据，返回本身
        StringBuffer sb2 = sb.append("hello");
        //追加
        sb.append("world");
        //插入
        sb.insert(5,"goodgood!");
        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);
        System.out.println(sb == sb2);
    }
}
