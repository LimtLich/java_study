package com.company.JAVA基础笔记8;

//泛型方法：把泛型定义在方法上
class ObjectTool{
    public <T> void  show(T c){
        System.out.println(c);
    }
}

public class 泛型方法 {
    public static void main(String[] args) {
        ObjectTool o = new ObjectTool();
        o.show("hello");
        o.show(2017);
        o.show("java");
        o.show(true);
    }
}
