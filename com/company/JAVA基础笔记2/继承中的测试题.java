package com.company.JAVA基础笔记2;

/*
* A:一个类的静态代码块，构造代码块，构造方法的执行流程：
*       静态代码块>构造代码块>构造方法
* B:静态的内容是随着类的加载而加载：
*       静态代码块的内容会有限执行
* C:子类初始化之前会进行父类初始化
* */

class fu{
    //先执行静态加载
    static{
        System.out.println("静态父代码块");
    }
    {
        System.out.println("父构造代码块");
    }
    public fu(){
        System.out.println("父构造方法");
    }
}

class zi extends fu{
    //首先是类的加载，zi类继承了fu类，所以先执行fu类的加载
    static{
        System.out.println("子静态代码块");
    }
    //其次是类的构造，zi类继承了fu类，所以先执行fu类的构造
    {
        System.out.println("子构造代码块");
    }
    public zi(){
        System.out.println("子构造方法");
    }
}

public class 继承中的测试题 {
    public static void main(String[] args){
        zi z = new zi();
    }
}
