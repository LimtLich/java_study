package com.company.JAVA基础笔记4;

public class String类的获取功能 {
    public static void main(String[] args) {
        String s = "helloWorld";
        //int length()
        System.out.println("s.length:" + s.length());
        //char charAt(int index)
        System.out.println("charAt:" + s.charAt(5));
        //int indexOf(int ch):因为int类型为大类型，可用char类型的'e'，也可以直接用101
        System.out.println("indexOf:" + s.indexOf(101));
        //int indexOf(int ch)
        System.out.println("indexOf:" + s.indexOf('l'));
        //int indexOf(String str)
        System.out.println("indexOf:" + s.indexOf("orl"));
        //int indexOf(int ch,int fromIndex)
        System.out.println("indexOf:" + s.indexOf('l', 2));
        //int indexOf(String str,int fromnIndex)
        System.out.println("indexOf:" + s.indexOf("World", 2));
        //String subString(int start)
        System.out.println("subString:" + s.substring(3));
        //String subString(int start,int end)包左不包右
        System.out.println("subString:" + s.substring(3, 6));

        System.out.println("------------------------遍历字符串----------------------");

        String s2 = "何事秋风悲画扇";
        for (int num = 0; num < s2.length(); num++) {
            System.out.println(s2.charAt(num));
        }

        System.out.println("------------------------统计大小写及数字----------------------");

        String s3 = "HelloWorld666";
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int num = 0; num < s3.length(); num++) {
            char ch = s3.charAt(num);
            if (ch >= '0' && ch <= '9') {
                numberCount++;
            } else if (ch >= 65 && ch < 97) {
                bigCount++;
            } else if (ch >= 97 && ch <= 122) {
                smallCount++;
            }
        }

        System.out.println("bigCount is:" + bigCount + ",smallCount is+" + smallCount + ",numberCount is:" + numberCount);
    }
}
