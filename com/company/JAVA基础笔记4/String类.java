package com.company.JAVA基础笔记4;

/*
* String特点：一旦被赋值就不能改变（值不能变，引用可以改变）
*       注1：字符串直接赋值的方式是先到字符串常量池里面去找，如果有就直接返回，没有，就创建并返回
*       注2：字符串如果是常量想家，是先加，然后在常量池找，如果有就直接返回，否则，就创建
* */

class StringDemo {

}

public class String类 {
    public static void main(String[] args) {
        byte[] b = {97, 98, 99, 100, 101, 102};
        String a1 = new String(b);
        System.out.println(a1);
        String a2 = new String(b, 2, 4);
        System.out.println(a2);
        System.out.println("------------------------");
        char[] c = {'a', 'b', 'c', 'l', '易', '啊'};
        String c1 = new String(c);
        String c2 = new String(c, 3, 2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("------------------------");
        //值不变，改变引用
        String t = "hello";
        t+="  world";
        System.out.println(t);
        System.out.println("------------------------");
        //区别：前者会创建2个对象（堆内存：new String()，常量区："different"），后者只创建1个或0个（常量区如有则不会再创建）。
        String d1 = new String("different");
        String d2 = "differrnt";
        System.out.println(d1==d2);//false
        System.out.println(d1.equals(d2));//true
    }
}
