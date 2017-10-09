package com.company.world;
import com.company.hello.CarStory;
import com.company.hello.Car;

public class BuildCar {
    public static void  main(String[] args){
        Car newCar1 = new Car(100,1);
        Car newCar2 = new Car(80,2);
        Car newCar3 = new Car(50,3);
        Car[] newCars = {newCar1,newCar2,newCar3};
        for(Car cars:newCars){
            CarStory.createCar(cars);
        }
        CarStory.countCars();
    }
}
