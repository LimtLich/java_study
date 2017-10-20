package com.company.JAVA基础笔记2;

/*
* 类与类：继承关系，只能单继承，可以多层继承
* 类与接口：实现关系，可以单实现，也可以多实现
*           还可以继承一个类的同时实现多接口
* 接口与接口：
*           继承关系，可以单继承，也可以多继承
*
*  抽象类被继承体现的是："is a"的关系，为共性功能
*  接口被实现体现的事："like a"的关系，为扩展功能---USB接口
* */

interface father1{
    public abstract void show();
}

interface mother1{
    public abstract void show2();
}

//接口继承
interface Sister extends father1,mother1{

}

//class sonImp implements father1,mother1
class sonImp extends Object implements father1,mother1{
    public void show(){
        System.out.println("show father");
    }
    public void show2(){
        System.out.println("show mother");
    }
}

public class 类与接口间关系 {

}
