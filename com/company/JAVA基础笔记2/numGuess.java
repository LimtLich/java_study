package com.company.JAVA基础笔记2;

import java.util.Scanner;

public class numGuess {
    public static void main(String[] args){
        int randomNum = (int)(Math.random()*100)+1;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("please guess the number:");
            int text = sc.nextInt();
            if(text>randomNum){
                System.out.println("smaller");
            }else if(text<randomNum){
                System.out.println("larger");
            }else{
                System.out.println("congratulation!");
                break;
            }
        }
    }
}
