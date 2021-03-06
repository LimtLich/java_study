package com.company.JAVA基础笔记2;

/*
* 代码块：
* 局部代码块：在方法中出现；限定变量声明周期，及早释放，提高内存利用率
* 构造代码块：在类中成员位置，用{ }括起来的代码。每次调用构造方法执行前，都会先执行构造代码块
*       作用：可以把多个构造方法中的共同代码放到一起，对对象进行初始化
* 静态代码块：在类中的成员位置，用{ }括起来的代码，只不过它用static修饰了
*       作用：一般是对类进行初始化。
*
* 执行顺序：静态代码块（只执行一次）-------构造代码块（每次调用构造方法都执行）-------构造方法
* */

public class 代码块 {
    public static void main(String[] args){
        //局部代码块
        {
            int a = 10;
            System.out.println(a);
        }
    }
}
