package com.company.JAVA基础笔记5;

public class Integer引入 {
    public static void main(String[] args) {
        //进制计算：除基取余，直到商为0，余数反转。
        System.out.println("---------- 进制转换（固定模式） --------------");

        //public static String toBinaryString(int i)二进制
        System.out.println(Integer.toBinaryString(100));
        //public static String toOctalString(int i)八进制
        System.out.println(Integer.toOctalString(100));
        //piblic static String toHexString(int i);
        System.out.println(Integer.toHexString(100));

        System.out.println("---------- 进制转换（非固定模式） --------------");

        System.out.println("十进制到其他进制");
        System.out.println(Integer.toString(100,2));
        System.out.println(Integer.toString(100,8));
        System.out.println(Integer.toString(100,16));
        //进制的范围：2进制~36进制
        System.out.println(Integer.toString(100,5));
        System.out.println(Integer.toString(100,6));
        System.out.println(Integer.toString(100,7));
        System.out.println("其他进制到十进制");//(8421计算)
        System.out.println(Integer.parseInt("100",2));
        System.out.println(Integer.parseInt("100",8));
        System.out.println(Integer.parseInt("100",10));
        System.out.println(Integer.parseInt("100",16));

        System.out.println("---------- Int 转 String --------------");

        //方式1：字符串拼接
        int i1 = 10;
        String s1 = "" + i1;
        System.out.println("s1:" + s1);

        //方式2：String.valueOf()  ***********推荐*****************
        int i2 = 10;
        String s2 = String.valueOf(i2);
        System.out.println("s2:" + s2);

        //方式3：引用类型调toString()
        int i3 = 10;
        Integer ii = new Integer(i3);
        String s3 = ii.toString();
        System.out.println("s3:" + s3);

        //方式4：
        int i4 = 10;
        String s4 = Integer.toString(i4);
        System.out.println("s4:" + s4);

        System.out.println("---------- String 转 Int--------------");

        //方式1
        String ss = "10";
        Integer ii2 = new Integer(ss);
        int x = ii2.intValue();
        System.out.println("x:" + x);

        //方式2  **************推荐******************
        String ss2 = "10";
        int x2 = Integer.parseInt(ss2);
        System.out.println("x2" + x2);
    }
}
