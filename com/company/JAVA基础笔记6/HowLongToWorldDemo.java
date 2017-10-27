package com.company.JAVA基础笔记6;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class HowLongToWorldDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter yout birthday:");
        String birthday = sc.nextLine();
        String regex = "\\d{4}+年\\d{1,2}+月\\d{1,2}日";
        if (birthday.matches(regex)) {
            Date newDate = new Date();
            long today = newDate.getTime();
            long bornDay = DateUtilDemo.stringToDate(birthday, "yy年MM月dd日").getTime();
            int passDay = (int) ((today - bornDay) / 1000 / 60 / 60 / 24);
            System.out.println("已降生：" + passDay + "天");
        } else {
            System.out.println("格式错误");
        }
    }
}
