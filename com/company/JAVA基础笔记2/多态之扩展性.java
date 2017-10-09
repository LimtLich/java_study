package com.company.JAVA基础笔记2;

class animal1{
    public void eat(){
        System.out.println("eatting");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}

class dog1 extends animal1{
    public void eat(){
        System.out.println("dog eat meet");
    }
    public void sleep(){
        System.out.println("dog sleep stand");
    }
}

class cat1 extends animal1{
    public void eat(){
        System.out.println("cat eat fish");
    }
    public void sleep(){
        System.out.println("cat sleep lay");
    }
}

class animalTool{
    //定义工具类统一管理animal1，使用static方法可以直接通过类名调用
    public static void useAnimal(animal1 p){
        p.eat();
        p.sleep();
    }
}

public class 多态之扩展性 {
    public static void main(String[] args){
        cat1 a = new cat1();
        cat1 b = new cat1();
        cat1 c = new cat1();
        animalTool.useAnimal(a);
        animalTool.useAnimal(b);
        animalTool.useAnimal(c);
        System.out.println("------------");
        dog1 d = new dog1();
        dog1 f = new dog1();
        animalTool.useAnimal(d);
        animalTool.useAnimal(f);
    }
}
