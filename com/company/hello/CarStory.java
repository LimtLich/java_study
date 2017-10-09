package com.company.hello;

import java.util.ArrayList;

public class CarStory {
    private static ArrayList<Car> newcar = new ArrayList<>();

    public static void createCar(Car car){
        newcar.add(car);
    }

    public static void countCars(){
        for(Car cars:newcar){
            String formatString = "This car speed on:%d.speed,and age is:%d";
            String output = String.format(formatString,cars.speed,cars.age);
            System.out.println(output);
        }
    }
}
