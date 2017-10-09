package com.company.JAVA基础笔记;

/*
    A：赋值前应先对数据进行判断
    B：BadStudentDemo类是一个测试类，测试类一般只创建对象，调用方法，所以判断应该定义在Student类中
    C：不可在成员变量的位置进行判断
*/

class BadStudent{
    String name;
    //设置为私有变量，必须通过setAge才能访问并修改age变量
    private int age;

    public void setAge(int a){
        if(a>0 && a<120){
            age = a;
        }else{
            System.out.println("年龄数值错误！");
        }
    }

    //显示所有成员变量值
    public void show(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}

class BadStudentDemo{
    public void method(BadStudent z){
        z.show();
        System.out.println("----------------------------------");
        z.name = "尼古拉斯凯奇";
        z.setAge(200);
        z.show();
        System.out.println("----------------------------------");
        //z.age = -18;//错误数据
    }
}

public class 封装概述 {
    public static void main(String[] args){
        new BadStudentDemo().method(new BadStudent());
    }
}
