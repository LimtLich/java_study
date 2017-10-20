package com.company.JAVA基础笔记3;

/*
* 返回值类型：
*       基本类型：String,int...
*       引用类型：
*           类：返回的是该类的对象
*           抽象类：返回的是该抽象类的具体子类对象
*           接口：返回的是该接口的实现类的对象
*
* 链式编程:每次调用完毕方法后,返回的是一个对象。xx.xxx().xxx().xxxxx()
* */

class humanBasic{
    public void walk(){
        System.out.println("Human can walk!");
    }
}

class humanDemo{
    public humanBasic geWwalk(){
        return new humanBasic();
    }
}

abstract class humanBasic1{
    public abstract void sayName();
}

class human1 extends humanBasic1{
    public void sayName(){
        System.out.println("My name is Mike!!");
    }
}

class humanDemo1{
    public humanBasic1 getHuman1(){
        return new human1();
    }
}

interface humanBasic2{
    public abstract void grow();
}

class human2 implements humanBasic2{
    public void grow(){
        System.out.println("I'm growing!");
    }
}

class humanDemo2{
    public humanBasic2 getHuman2(){
        return new human2();
    }
}

public class 类作为返回值类型 {
    public static void main(String[] args){
        System.out.println("--------类--------");
        humanDemo a = new humanDemo();
        humanBasic b = a.geWwalk();
        b.walk();
        System.out.println("--------抽象类--------");
        humanDemo1 c = new humanDemo1();
        humanBasic1 d = c.getHuman1();
        d.sayName();
        System.out.println("--------接口--------");
        humanDemo2 e = new humanDemo2();
        humanBasic2 f = e.getHuman2();
        f.grow();
        System.out.println("--------链式编程--------");
        humanDemo2 g = new humanDemo2();
        g.getHuman2().grow();
    }
}
