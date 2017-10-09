package com.company.JAVA基础笔记;

/*
* this:是当前类的对象引用，谁调用这个方法，在该方法内部的this就代表谁
* this场景：解决局部变量隐藏成员变量
* */

class student{
    private String name;
    private int age;

    public void setName(String name){
      this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}

public class this关键字  {
    public static void main(String[] args){
        student newStudent = new student();
        System.out.println(newStudent);
        newStudent.setName("jason");
        newStudent.setAge(20);
        System.out.println("Student name:"+ newStudent.getName());
        System.out.println("Student age:"+ newStudent.getAge());
    }
}
