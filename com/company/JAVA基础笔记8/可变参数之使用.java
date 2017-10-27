package com.company.JAVA基础笔记8;

/*
* 可变参数：定义方法的时候不知道该定义多少个参数
* 格式：
*           修饰符 返回值类型 方法名（数据类型... 变量名）{
*
*           }
*
*           注：
*               这里的变量其实是一个数组
*               如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
* */

public class 可变参数之使用 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(sum(a, b, c));
    }

    public static int sum(int... a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }
}
