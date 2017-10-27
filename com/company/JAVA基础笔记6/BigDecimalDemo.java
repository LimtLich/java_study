package com.company.JAVA基础笔记6;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //浮点基本计算
        System.out.println(0.09 + 0.01);//结果不精确，可能导致数据丢失
        //引用BigDecimal类：不可变的、任意精度的有符号十进制数，可以解决数据丢失问题
        BigDecimal b = new BigDecimal(0.09);
        BigDecimal b2 = new BigDecimal(0.01);
        //BigDecimal基本运算
        System.out.println("add:"+b.add(b2));
        System.out.println("substract:"+b.subtract(b2));
        System.out.println("multiply:"+b.multiply(b2));
        //参数：要除以的值，要返回的标度（保留几位小数），应用的舍入模式
        System.out.println("divide:"+b.divide(b2,3,BigDecimal.ROUND_HALF_UP));
    }
}
