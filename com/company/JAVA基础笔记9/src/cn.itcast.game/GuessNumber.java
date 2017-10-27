package com.company.JAVA基础笔记9.src.cn.itcast.game;

import java.util.Scanner;

public class GuessNumber {
    public static void play() {
        int ranNum = (int) (Math.random() * 100 + 1);
        while (true) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("ranNum:" + ranNum);
            if (num == ranNum) {
                System.out.println("congratulation!");
                break;
            } else if (num > ranNum) {
                System.out.println("num uncorrect(try smaller)");
            } else if (num < ranNum) {
                System.out.println("num uncorrect(try bigger)");
            }
        }
    }
}
