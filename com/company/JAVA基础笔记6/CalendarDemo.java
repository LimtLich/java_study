package com.company.JAVA基础笔记6;

import java.util.Calendar;

/*
* Calendar：它为特定瞬间与一组诸如YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法
*
*       public int get(int field)：返回给定日历字段的值，日历类中的每个日历字段都是静态的成员变量，并且是int类型
*
*       public void add(int field,int amount)：根据给定的日历字段和对应的时间，来对当前的日历进行操作
*       public final void set(int year,int month,int date)：设置当前日历的年月日
* */
public class CalendarDemo {
    public static void main(String[] args) {
        //其日历字段已由当前日期和时间初始化
        Calendar rightNow = Calendar.getInstance();//子类对象
        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH) + 1;//月份从0开始
        int day = rightNow.get(Calendar.DAY_OF_MONTH);
        int hour = rightNow.get(Calendar.HOUR);
        System.out.println("today is:" + year + "年" + month + "月" + day + "日");

        System.out.println("----------------------------");
        rightNow.add(Calendar.YEAR, -25);
        rightNow.add(Calendar.MONTH, -4);
        rightNow.add(Calendar.DAY_OF_MONTH, 4);
        int year2 = rightNow.get(Calendar.YEAR);
        int month2 = rightNow.get(Calendar.MONTH) + 1;//月份从0开始
        int day2 = rightNow.get(Calendar.DAY_OF_MONTH);

        System.out.println("MINGO'S birthday is:" + year2 + "年" + month2 + "月" + day2 + "日");

        System.out.println("----------------------------");

        rightNow.set(2017, 11, 31);
        int year3 = rightNow.get(Calendar.YEAR);
        int month3 = rightNow.get(Calendar.MONTH) + 1;//月份从0开始
        int day3 = rightNow.get(Calendar.DAY_OF_MONTH);
        System.out.println("setting day is:" + year3 + "年" + month3 + "月" + day3 + "日");
    }
}
