package com.company.JAVA基础笔记2;

/*
* final修饰局部变量的问题：
*   基本类型：基本类型的值不能发生改变
*   引用类型：引用类型的地址值不能发生改变，但是，该对象的堆内存的值是可以改变的。
* */

class finalStudent{
    public int num = 10;
}

public class final关键字修饰局部变量 {
    public static void main(String[] args){
        //局部变量是基本数据类型
        int x = 10;
        x=100;
        System.out.println(x);
        final int y = 10;
        //无法为最终变量y分配值
        //y=100;
        System.out.println(y);
        System.out.println("------------------------");
        //局部变量是引用数据类型
        finalStudent a = new finalStudent();
        System.out.println(a.num);
        a.num= 100;
        System.out.println(a.num);
        System.out.println("--------------------------");

        //当final修饰局部变量为引用数据类型时，其内存空间为固定，不影响其内部变量的修改
        //对象地址不能改变，但对象的内容可以改变
        final finalStudent c = new finalStudent();
        System.out.println(c.num);
        c.num = 100;
        System.out.println(c.num);

        //重新分配内存空间，地址改变，所以无法为最终变量c分配值
        //c = new finalStudent();
    }
}
