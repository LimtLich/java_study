package com.company.JAVA基础笔记;

/*
* 匿名方法应用：
* A：调用方法，仅仅只调用一次的时候
* B：匿名对象调用完毕即被垃圾回收器回收，提高内存使用效率
* C：匿名对象可作为实参传递
* */

//创建Student类
class Studentxx{
    public void show(){
        System.out.println("Carry on!");
    }
}

class StudentDemo{
    public void metho(Studentxx s){
        s.show();
    }
}

public class 匿名对象 {

    public static void main(String[] args){
        //非匿名调用
        Studentxx s = new Studentxx();
        s.show();
        System.out.println("----------------------------------");
        //匿名调用
        new Studentxx().show();
        new Studentxx().show();//重新创建新对象，开辟新的内存空间，不适合多次调用
        System.out.println("----------------------------------");
        StudentDemo d = new StudentDemo();
        d.metho(new Studentxx());
        System.out.println("----------------------------------");
        new StudentDemo().metho(new Studentxx());
    }
}
