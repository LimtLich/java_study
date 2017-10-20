package com.company.JAVA基础笔记3;

/*
* 形式参数：
*       基本类型（String,int...）
*       引用类型：
*           类名：如匿名对象  new student.method(new student())，需要的是该类的对象
*           抽象类：需要的是该抽象类的具体子类对象
*           接口：需要的是该接口的实现类对象
* */

interface codeSkill{
    public abstract void code();
}

abstract class person5{
    public abstract void study();
}

class studentDemo{
    public void method(person5 p){
        p.study();
    }
}

class coderDemo{
    public void method(codeSkill c){
        c.code();
    }
}

class student2 extends person5{
    public void study(){
        System.out.println("I like study!");
    }
}

class coder implements codeSkill{
    public void code(){
        System.out.println("I can code!");
    }
}

public class 类为形参  {
    public static void main(String[] args){
        System.out.println("-----------抽象类为形参---------------");
        studentDemo a = new studentDemo();
        a.method(new student2());
        System.out.println("----------接口为形参---------------");
        coderDemo d = new coderDemo();
        d.method(new coder());
    }
}
