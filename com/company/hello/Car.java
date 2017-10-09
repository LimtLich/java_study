package com.company.hello;

public class Car {
    public int speed;
    public int age;
    public engine enginer;

    private static String logo = "Lexus";

    {
        speed = 30;
        age = 21;
    }

    public Car(){

    }

    public static String getLogo(){
        return logo;
    }

    public Car(int speed,int age){
        this.speed = speed;
        this.age = age;
    }

    public Car(int speed,int age,engine enginer){
        this.speed = speed;
        this.age = age;
        enginer.power = 500;
        this.enginer = enginer;
    }

    public void runSpeed(int speed){
        System.out.println("Car is running on:"+speed);
    }
    public void runSpeed(){
        System.out.println("Car is running on :70");
    }

    public void runSpeed(int speed,int age,engine enginer){
        System.out.println("Car is running on:"+speed+",Car age is:"+age+",Car's engine is:"+enginer.power);
        Integer[] aa = {1,2,3,4,5};
        setAttr(aa);
    }

    public static <T> void setAttr(T[] objects){
        for(T element:objects){
            System.out.println(element);
        }
    }
}
