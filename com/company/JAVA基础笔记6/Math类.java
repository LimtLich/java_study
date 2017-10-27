package com.company.JAVA基础笔记6;

public class Math类 {
    public static void main(String[] args) {
        System.out.println("PI:" + Math.PI);
        System.out.println("E:" + Math.E);

        System.out.println("-------------------------");
        System.out.println("绝对值：" + Math.abs(10));
        System.out.println("绝对值：" + Math.abs(-10));

        System.out.println("向上取整：" + Math.ceil(12.33));
        System.out.println("向下取整：" + Math.floor(12.33));

        System.out.println("最大值：" + Math.max(10, 20));
        System.out.println("多层最大值：" + Math.max(Math.max(5, 9), Math.max(10, 4)));

        System.out.println("a的b次幂：" + Math.pow(2, 4));

        System.out.println("随机数：" + Math.random());
        System.out.println("真.随机数：" + (int) (Math.random() * 100 + 1));
        //四舍五入的实现实为：a+0.5f的向下取整
        System.out.println("四舍五入：" + Math.round(12.56f));
        System.out.println("四舍五入：" + Math.round(12.21f));

        System.out.println("正平方根：" + Math.sqrt(4));
    }
}
