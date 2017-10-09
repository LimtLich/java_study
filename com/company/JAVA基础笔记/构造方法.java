package com.company.JAVA基础笔记;

/*
* 给对象的数据进行初始化
* 格式：方法名与类名相同
*       没有返回值类型，连void都无
*       没有具体的返回值
* */

/*
* 成员变量赋值：
* setXXX()
* 构造方法
* */

class Student2{

    private String name;
    private int age;
    /*
    * 如果没有给出构造方法，系统自动提供无参默认修饰符构造函数：Student(){ }
    * */

    //已给出自定义构造函数后，系统不会再定义默认构造函数
    public Student2(){
        System.out.println("this is constructor!");
    }

    //构造方法重载
    public Student2(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("Student's name is:"+name+"student's age is:"+age);
    }
}

public class 构造方法 {
    public static void main(String[] args){
        //创建（构造）无参对象
        Student2 s = new Student2();
        System.out.println(s);
        //创建有参数对象
        Student2 c = new Student2("mike",19);
        System.out.println(c);
    }
}
