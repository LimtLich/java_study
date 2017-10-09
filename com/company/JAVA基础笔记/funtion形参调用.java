package com.company.JAVA基础笔记;

//形参为基本类型

//创建Demo类
class Demo{
    public int sum(int a,int b){
        return a + b;
    }
}

//形参为引用类型（类，接口，数组...）
class MINGO{
    public void show(){
        System.out.println("MINGO FIGHTING");
    }
}

class MINGODemo{
    //看到一个方法的形参是一个类 类型（引用类型），需要该类的对象
    public void method(MINGO Li){
        Li.show();
    }
}

public class funtion形参调用 {
    public static void main (String[] args){
        //形参为基本类型的调用
        Demo a = new Demo();
        int result = a.sum(5,6);
        System.out.println("result:"+result);
        System.out.println("-------------------------------------");
        //形参为引用类型
        MINGO M = new MINGO();
        MINGODemo L = new MINGODemo();
        L.method(M);
    }
}
