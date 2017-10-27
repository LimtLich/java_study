package com.company.JAVA基础笔记6;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("date:" + d);
        //返回当前日期毫秒值
        System.out.println("getDate:" + d.getTime());
        d.setTime(1000);//1970 + 东八区（8小时）+1000毫秒
        System.out.println("setDate:" + d);
        System.out.println("----------------------------");
    }
}
