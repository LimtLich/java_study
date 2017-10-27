package com.company.JAVA基础笔记6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则表达式之获取 {
    public static void main(String[] args) {
        String s = "aa bbb cc ddd ee fff gg hhh";
        String regex = "\\w{3}";
        //把规则编译成模式对象
        Pattern p = Pattern.compile(regex);
        //通过模式对象得到匹配器对象
        Matcher m = p.matcher(s);
        //调用匹配器对象的功能
        //通过find（）方法就是查找有没有满足条件的子串
        boolean flag = m.find();
        System.out.println(flag);
        //通过group（）获取值
        String ss = m.group();
        System.out.println(ss);

        System.out.println("--------------");
        //使用循环遍历所有满足条件的子串
        //注：使用group（）之前必须先find（）
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
