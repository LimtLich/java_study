package com.company.JAVA基础笔记6;

public class System类之exit与currentTimeMillis {
    public static void main(String[] args) {
        //获取当前毫秒值，可计算程序运行时间（非标准使用）
        long start = System.currentTimeMillis();
        for (int x = 0; x < 100000; x++) {
            System.out.println(x);
        }
        long end = System.currentTimeMillis();
        System.out.println("use time:" + (end - start));

        System.out.println("hello");
        System.exit(0);//非 0 状态码表示异常终结，0 表示正常终结
    }
}
