package com.company.JAVA基础笔记2;
import java.util.Random;
public class randomTest {
    public static void main(String[] args){
        Random r = new Random();
        System.out.println(r.nextDouble());
        System.out.println("--------------------------------");
        int d = (int)(Math.random()*100)+1;
        System.out.println(d);
    }
}
