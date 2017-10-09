package com.company.world;
import com.company.hello.Car;
import com.company.hello.engine;
import com.company.hello.license;
import java.util.Scanner;

public class drive {

    public static void main(String[] args) {
        // write your code here
        engine enginer = new engine(200);
        Car mycar = new Car(70,5,enginer);
        mycar.runSpeed(mycar.speed,mycar.age,mycar.enginer);
        license myLicense = new license();
        String name = "    ming   ";
        System.out.println(myLicense.showLicense(name.trim(),25,Car.getLogo()));

    }
}
