package com.company.JAVA基础笔记2;

/*
* 多态中的成员访问特点：
*   A：成员变量
*       编译看左边，运行看左边
*   B：构造方法
*       创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化
*   C：成员方法
*       编译看左边，运行看右边
*   D：静态方法
*       编译看左边，运行看左边
*       （静态和类相关，算不上重写，所以访问还是左边）
*
*    由于成员方法存在方法重写，所以它运行看右边
* */

class fu11{
    int num1 = 10;
    public void show(){
        System.out.println("show of fu");
    }
    public static void show1(){
        System.out.println("show1 of fu");
    }
}

class zi11 extends fu11{
    int num1 = 100;
    public void show(){
        System.out.println("show of zi");
    }
    public static void show1(){
        System.out.println("show1 of zi");
    }
}

public class 多态  {
    public static void main(String[] args){
        fu11 f = new zi11();
        System.out.println(f.num1);
        f.show();
        f.show1();
    }
}
