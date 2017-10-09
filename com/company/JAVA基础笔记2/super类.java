package com.company.JAVA基础笔记2;
/*
* super和this的区别：
* this代表本类对应的引用
* super代表父类存储空间的标识（可以理解为父类引用,可以操作父类的成员）
* */

class father{
    public father(){}
    public int age;
    public int num = 10;
    public father(int age){
        this.age = age;
    }
}

class son extends father{
    public son(){
        //调用父类构造函数
        super(29);
    }
    public int num = 20;
    public void sayNum(){
        int num = 30;
        System.out.println("inner num:"+num+"son num:"+this.num+"father num:"+super.num+",father's age is:"+super.age);
    }

}

public class super类 {
    public static void main(String[] args){
        son myson = new son();
        myson.sayNum();
    }
}
