package com.company.JAVA基础笔记4;

/*
* 基本格式：
*       public boolean hasNextXxx()：判断是否是某种类型的元素
*       public Xxx neatXxx()：获取该元素
*
*       注：当先获取一个数值，再获取一个字符串时会出错，因为是直接把换行符号（字符串）赋给了下一个目标字符串
*       解决1：创建另外一个Scanner()
*       解决2：把所有的数据都先按照字符串获取，然后要什么，你就对应的转换为什么
* */

import java.util.Scanner;

public class Scanner原理 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*  判断
        if(sc.hasNextInt()){
            System.out.println(sc.nextInt());
        }else{
            System.out.println("wrong input!");
        }*/

        int a = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        String s = sc2.nextLine();
        System.out.println("a:" + a + ",s:" + s);
    }
}
