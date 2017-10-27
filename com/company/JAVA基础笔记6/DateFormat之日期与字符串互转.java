package com.company.JAVA基础笔记6;

/*
* Date ------ String（格式化）
*           public final String format(Date date)
* String ------- Date（解析）
*           public Date parse(String source)
*
*  DateFormat：可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat.
*
*  SimpleDateFormat构造方法：
*   SimpleDateFormat()：默认模式
*   SimpleDateFormat(String pattern)：给定模式
*
*   年 y
*   月 M
*   日 d
*   时 H
*   分 m
*   秒 s
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat之日期与字符串互转 {
    public static void main(String[] args) throws ParseException {
        System.out.println("---------Date to String----------");
        Date d = new Date();
        //输出当前日期
        System.out.println("date:" + d);
        //默认格式化
        SimpleDateFormat s = new SimpleDateFormat();
        System.out.println("format:" + s.format(d));
        //指定模式
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println("pattern format:" + s2.format(d));

        System.out.println("---------String to Date----------");
        String date = "2017-10-24 14:05:56";
        //解析时格式必须一致
        SimpleDateFormat s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("parse:" + s3.parse(date));
    }
}
