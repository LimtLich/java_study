package com.company.JAVA基础笔记2;

/*
* 接口成员特点
*   成员变量：只能是常量，并且是静态的
*   默认修饰符：public static final（建议手动给出）
*   构造方法：接口没有构造方法
*   成员方法：只能是抽象方法
*   默认修饰符：public abstract（建议手动给出）
*
*
*   所有的类都默认继承自一个类：Object
*   类Object是类层次结构的根类。每个类都使用Object作为超类
* */

interface inter{
    public int num1 = 10;//非完全体，默认填充
    public final int num2 = 20;//非完全体，默认填充
    public static final int num3 = 30;//完全体，建议日常补全
    int num4 = 40;//简写体，默认填充

    //public inter(){};报错，接口无构造方法

    //简写体，默认填充
    void sayHi();
    //完全体，建议日常补全
    public abstract void sayHello();
}

/*class interImplem implements inter{

}
*/

//所有的类都默认继承自一个类：Object
//类Object是类层次结构的根类。每个类都使用Object作为超类

class interImplem extends Object implements inter{
    public interImplem(){
        super();//无父类时指向Object
    }

    public void sayHi(){
        System.out.println("Hi!!");
    }

    public void sayHello(){
        System.out.println("Hello!!");
    }
}

public class 接口成员特点 {
    public static void main(String[] args){
        inter a = new interImplem();
        System.out.println(a.num1+","+a.num2+","+a.num3+","+a.num4);
        //静态常量无法改变
        //a.num1 = 100;
        //a.num2 = 200;
        System.out.println("因static，可通过类直接调用："+inter.num1+","+inter.num2+","+inter.num3+","+inter.num4);
        System.out.println("----------------------------");
        a.sayHi();

    }
}
