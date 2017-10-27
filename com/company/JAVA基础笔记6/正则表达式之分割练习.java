package com.company.JAVA基础笔记6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 正则表达式之分割练习 {
    public static void main(String[] args) {
        String str1 = "aa,bb,cc";
        String[] str1Array = str1.split(",");
        for (int x = 0; x < str1Array.length; x++) {
            System.out.println(str1Array[x]);
        }
        System.out.println("-------------------------");
        String str2 = "aa.bb.cc";
        String[] str2Array = str2.split("\\.");//
        for (int x = 0; x < str1Array.length; x++) {
            System.out.println(str2Array[x]);
        }
        System.out.println("-------------------------");
        String str3 = "aa   bb                    cc";
        String[] str3Array = str3.split(" +");//空白+
        for (int x = 0; x < str1Array.length; x++) {
            System.out.println(str3Array[x]);
        }
        System.out.println("-------------------------");
        String str4 = "D:\\Tools\\JavaStudy\\day14\\day14";
        String[] str4Array = str4.split("\\\\");
        for (int x = 0; x < str1Array.length; x++) {
            System.out.println(str4Array[x]);
        }

        System.out.println("-----------字符串中的数字排序--------------");
        //定义字符串
        String s = "11 88 56 86 98 17 55 20";
        //字符串转为字符串数组
        String[] sArray = s.split(" ");
        //定义int数组
        int[] arr = new int[sArray.length];
        //把String数组变换成int数组
        for (int x = 0; x < sArray.length; x++) {
            arr[x] = Integer.parseInt(sArray[x]);
        }
        //对int数组进行排序
        Arrays.sort(arr);
        //输出目标字符串
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            sb.append(arr[x] + " ");
        }
        //转化为字符串并通过trim删除前后多余的空格
        String result = sb.toString().trim();
        System.out.println("result:" + result);
    }
}
