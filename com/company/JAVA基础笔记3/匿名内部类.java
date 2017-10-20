package com.company.JAVA基础笔记3;

/*
* 匿名内部类
*       就是内部类的简化写法
* 前提：存在一个类或者接口
*       这里的类可以使具体类也可以是抽象类
*
* 格式：
*       new 类名或者接口名（）{
*           重写方法；
*       }
*
*  本质：是一个继承了该类或者实现了该接口的子类匿名对象
* */

interface Inter{
    public abstract void show1();
    public abstract void show2();
}

class Outerx{
    public void method(){
        //单例
        new Inter(){
            public void show1(){
                System.out.println("show1 here!");
            }
            public void show2(){
                System.out.println("show2 here");
            }
        }.show1();
        //复例
        Inter i = new Inter(){
            public void show1(){
                System.out.println("show1 here!");
            }
            public void show2(){
                System.out.println("show2 here");
            }
        };
        i.show1();
        i.show2();
    }
}

public class 匿名内部类 {
    public static void main(String[] args){
        Outerx o = new Outerx();
        o.method();

    }
}
