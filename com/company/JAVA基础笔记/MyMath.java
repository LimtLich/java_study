package com.company.JAVA基础笔记;
import java.util.Scanner;

class math{
    public math(){
        System.out.println("无参数构造");
    }
    public int add(int a,int b){
        return a+b;
    }
    public int reduce(int a,int b){
        return a-b;
    }

}

public class MyMath {
    public static void main(String[] args){
        math m = new math();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数字");
        int firstNum = scan.nextInt();
        System.out.println("请再次输入数字");
        int secondNum = scan.nextInt();
        int addResult = m.add(firstNum,secondNum);
        int reduce = m.reduce(firstNum,secondNum);
        System.out.println("add result is:"+addResult+",reduce result is:"+reduce);
    }
}
