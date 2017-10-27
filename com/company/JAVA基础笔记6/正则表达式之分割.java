package com.company.JAVA基础笔记6;

/*
* String类的public String[] split(String regex)
* 根据给定正则表达式的匹配拆分此字符串
* */

import java.util.Scanner;

public class 正则表达式之分割 {
    public static void main(String[] args) {
        //拟定后台捕获的数据范围
        String ages = "18-24";
        //定义规则
        String regex = "-";
        //调用方法
        String[] strArray = ages.split(regex);
        //遍历
//        for (int x = 0; x < strArray.length; x++) {
//            System.out.println(strArray[x]);
//        }
        Integer start = Integer.parseInt(strArray[0]);
        Integer end = Integer.parseInt(strArray[1]);
        System.out.println("please enter the age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= start && age < end) {
            System.out.println("great!");
        } else {
            System.out.println("no!");
        }
    }
}
