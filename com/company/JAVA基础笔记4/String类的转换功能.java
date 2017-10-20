package com.company.JAVA基础笔记4;

public class String类的转换功能 {
    public static void main(String[] args) {
        String s = "JavaSE";

        //byte[] getBytes():把字符串转换为字节数组
        byte[] bys = s.getBytes();
        for (int num = 0; num < bys.length; num++) {
            System.out.println(bys[num]);
        }

        //char[] toCharArray();把字符串转换为字符数组
        char[] ch = s.toCharArray();
        for (int num = 0; num < ch.length; num++) {
            System.out.println(ch[num]);
        }

        //static String valueOf(char[] chs):把字符数组转换成字符串
        String ss = String.valueOf(ch);
        System.out.println(ss);

        //static String valueOf(int i):把int类型的数据转成字符串，注：String类的valueOf方法可以把任意类型的数据转成字符串
        int a = 100;
        System.out.println(String.valueOf(a));

        //String toLowerCase():把字符串转成小写
        System.out.println(s.toLowerCase());

        //String toUpperCase():把字符串转成大写
        System.out.println(s.toUpperCase());

        //String concat(String str):字符串拼接
        String h = "hello";
        String w = "world";
        String concat = h.concat(w);
        System.out.println(concat);

        System.out.println("----------------字符串首字母大写其余小写-----------------");
        String m = "helloWORLD";
        System.out.println("before translate:" + m);
        String head = m.substring(0, 1);
        String body = m.substring(1);
        String result = head.toUpperCase() + body.toLowerCase();
        System.out.println("after translate:" + result);
    }
}
