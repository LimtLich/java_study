package com.company.JAVA基础笔记;

/*
* 变量何时定义为成员变量：
*   如果这个变量是用来描述这个个类的信息的,那么该变量就应该定义为成员变量
* 变量到底定义在哪里：
*   变量的范围是越小越好，因为能及时的被回收，但若是描述类的信息就要定义为成员变量
* */

class face{
    //描述类的成员变量
    public String eyes;
    public String ears;
    public String sayName(){
        //变量定义范围越小越好,局部变量必须先初始化
        String name = "Lisa";
        return name;
    }
}

public class 类成员变量定义标准 {
    public static void main(String[] args){
        face a = new face();
        System.out.println(a.sayName());
    }
}
