package com.company.JAVA基础笔记2;

/*
* 继承的使用："is a"规则，如：Student（子）is a Person（父）;Teacher（子） is a Person（父）
* */

class person{
    String name;
    int age;
    public person(){}
    public void eat(){
        System.out.println("eatting");
    }
}

class Studentx extends person{
    public Studentx(){}
}

public class 继承 {
    public static void main(String[] args){
        Studentx s = new Studentx();
        s.eat();
    }
}
