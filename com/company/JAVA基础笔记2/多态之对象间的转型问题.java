package com.company.JAVA基础笔记2;

/*
* 多态弊端:
*       不能使用子类的特有功能
*
* 对象间的转型问题：
*       向上转型：fu2 f = new zi2();
*       向下转型:zi2 z = (zi2)f;//要求该f必须是能够转换为zi2的。
* */

class fu2{
    public void show(){
        System.out.println("show fu");
    }
}

class zi2 extends fu2{
    public void show(){
        System.out.println("show zi");
    }
    public void method(){
        System.out.println("method zi");
    }
}

public class 多态之对象间的转型问题 {
    public static void main(String[] args){
        //向上转型
        fu2 f = new zi2();
        f.show();
        //父类中不存在method，无法使用子类特有功能
        //f.methos();
        System.out.println("------------------------");
        //向下转型
        zi2 z = (zi2) f;
        z.show();
        z.method();
    }
}
