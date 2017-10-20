package com.company.JAVA基础笔记4;

import java.util.Scanner;

public class GuessNumber {
    public static void start() {
        int randonNum = (int) (Math.random() * 100) + 1;//randon 为double类型
        System.out.println("Please guess the number(you have 3 chance):");
        for (int num = 3; num > 0; num--) {
            Scanner s = new Scanner(System.in);
            int tryNum = s.nextInt();
            if (tryNum == randonNum) {
                System.out.println("congratulation!!");
                break;
            } else {
                if (num - 1 == 0) {
                    System.out.println("no more chance,game over!");
                } else {
                    System.out.println("please try more again(" + (num - 1) + " times left):");
                }
            }
        }
    }
}
