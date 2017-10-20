package com.company.JAVA基础笔记4;

public class String类其他功能 {
    public static void main(String[] args) {
        String s = "helloWorld";

        //String replace(char old,char new)
        System.out.println(s.replace('l','f'));
        //String replace(String old,String new)
        System.out.println(s.replace("hello","fight"));

        //String trim()：去除首尾空格符
        String s2 = "      hello         ";
        System.out.println(s2);
        System.out.println(s2.trim());

        //int compareTo(String str)按字典顺序比较两个字符串
        //int compareToIgnoreCase(String str)同上，忽略大小写
        //注1：相同时值为0
        // 注2：B字典顺序减A字段顺序，可为负数，序位字母相同时继续向下比对直至出现不同；

        String s3 = "helloWorld";
        String s4 = "aoa";
        String s5 = "lpl";
        String s6 = "helloGolf";
        String s7 = "hello";

        System.out.println(s.compareTo(s3));
        System.out.println(s.compareTo(s4));
        System.out.println(s.compareTo(s5));
        System.out.println(s.compareTo(s6));
        //若前面一致，值为A的长度减去B的长度
        System.out.println(s.compareTo(s7));

    }
}
