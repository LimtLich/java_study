package com.company.JAVA基础笔记2;

class animal{
      private String name;
      private int age;
      private String color;
      public animal(){}
      public animal(String name,int age,String color){
          this.name = name;
          this.age = age;
          this.color = color;
          System.out.println("My name is:"+name+",my age is"+age+",my color is:"+color+".");
      }
}

class dog extends animal{
    public dog(){};
    public dog(String name,int age,String color){
        super(name,age,color);
        System.out.println("I'm a dog!");
    }
    public void lookDoor(){
        System.out.println("I can lookDoor!");
    }
}

class cat extends animal{
    public cat(){}
    public cat(String name,int age,String color){
        super(name,age,color);
        System.out.println("I'm a cat!");
    }
    public void playGame(){
        System.out.println("I like play games!");
    }
}

public class 继承练习 {
    public static void main(String[] args){
        dog a = new dog("Lisa",3,"black");
        cat b = new cat("Mini",4,"yellow");
    }

}
