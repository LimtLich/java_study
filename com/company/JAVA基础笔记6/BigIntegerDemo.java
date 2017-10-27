package com.company.JAVA基础笔记6;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        //输入Integer最大值
        System.out.println(Integer.MAX_VALUE);
        //打印最大值Integer
        System.out.println(new Integer("2147483647"));
        //打印超出范围Integer
        //System.out.println(new Integer("2147483648"));报错，超出范围

        //定义BigInteger接收超出Integer范围的数值
        BigInteger b = new BigInteger("2147483648");
        System.out.println("BigInteger:" + b);
        //BigInteger常用操作
        BigInteger i = new BigInteger("8");
        BigInteger ii = new BigInteger("2");

        System.out.println("add:" + i.add(ii));
        System.out.println("substract:" + i.subtract(ii));
        System.out.println("multiply:" + i.multiply(ii));
        System.out.println("divide:" + i.divide(ii));
        //返回商和余数的数组
        BigInteger[] iis = i.divideAndRemainder(ii);
        System.out.println("商：" + iis[0]);
        System.out.println("余：" + iis[1]);
    }
}
