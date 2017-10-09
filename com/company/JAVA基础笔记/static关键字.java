package com.company.JAVA基础笔记;

/*
* 针对多个对象有共同的这样的成员变量的时候，JAVA就提供了一个关键字来修饰：static
* 被修饰的数据对所有对象共有
* 静态变量可以直接通过类名调用
* 静态方法中没有this关键字：
* 静态是随着类的加载而加载，this是随着对象的创建而存在
* 静态比对象先存在。
* 静态只能访问静态，非静态可以访问静态及非静态
* */

class person{
    private String name;
    private int age;

    //String country;
    //更改为静态共享
    static String country;

    public person(){

    }

    public person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void show(){
        System.out.println("name is:"+name+",age is:"+age+",country is:"+country);
    }
}

public class static关键字 {
    //共同成员变量country
    public static void main(String[] args){
        person p1 = new person("麦克雷",22,"美利坚");
        person p2 = new person("桑托斯",30);
        p2.show();
    }
}
