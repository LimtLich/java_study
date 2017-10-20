package com.company.JAVA基础笔记5;

import java.util.Scanner;

public class Character引入 {
    public static void main(String[] args) {
        System.out.println("isUpperCase:" + Character.isUpperCase('A'));
        System.out.println("isLowerCase:" + Character.isLowerCase('a'));
        System.out.println("isDigit:" + Character.isDigit('0'));
        System.out.println("toUpperCase:" + Character.toUpperCase('a'));
        System.out.println("toLowerCase:" + Character.toLowerCase('A'));

        System.out.println("-------练习---------");
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        char[] ch = text.toCharArray();
        for (int num = 0; num < ch.length; num++) {
            if (Character.isUpperCase(ch[num])) {
                bigCount++;
            } else if (Character.isLowerCase(ch[num])) {
                smallCount++;
            } else if (Character.isDigit(ch[num])) {
                numberCount++;
            }
        }

        System.out.println("bigCount:" + bigCount + ",smallCount:" + smallCount + ",numberCount:" + numberCount);
    }
}
