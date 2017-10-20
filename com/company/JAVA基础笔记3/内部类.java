package com.company.JAVA基础笔记3;

/*
* 访问成员内部类：外部类名.内部类名 对象名 = 外部类对象.内部类对象
*
* 成员内部类的修饰符：
*       private :为了保证数据的安全性
*       static  ：为了方便访问数据
*                静态内部类访问的外部类数据必须使用静态修饰
* */

class outer{
    private int num = 10;
    class inner{
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        inner i = new inner();
        i.show();
    }
}

class body{
    private String id = "doctor";
    private class heart{
        public void operator(){
            System.out.println("Heart fixing!!");
        }
    }

    public void method(){
        if(id == "doctor"){
            heart h = new heart();
            h.operator();
        }else{
            System.out.println("Get out!!");
        }
    }
}

class outer2{
    private int num1 = 10;
    private static int num2 = 100;
    public static class inner2{
        public void show1(){
            System.out.println(num2);
        }
        public static void show2(){
            System.out.println(num2);
        }
    }
}

public class 内部类 {
    public static void main(String[] args){
        //访问成员内部类
        outer.inner oi = new outer().new inner();
        oi.show();
        System.out.println("----------------------------------");
        body a = new body();
        a.method();
        System.out.println("----------------------------------");
        //
        outer2.inner2 oi2 = new outer2.inner2();
        oi2.show1();
        oi2.show2();
        outer2.inner2.show2();
    }
}
