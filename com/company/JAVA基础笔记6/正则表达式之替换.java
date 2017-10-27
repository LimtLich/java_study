package com.company.JAVA基础笔记6;

public class 正则表达式之替换 {
    public static void main(String[] args) {
        String s = "adsl123123adsl123adsl";
        String regex = "\\d";
        //替换或去除字符串中的数字
        String replaseS = s.replaceAll(regex,"*");
        System.out.println(replaseS);
    }
}
