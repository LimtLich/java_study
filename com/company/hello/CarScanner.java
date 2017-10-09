package com.company.hello;
import java.util.Scanner;

public class CarScanner {
    public void enterScanner(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first scanner:");
        int x = sc.nextInt();
        System.out.println("please enter the second scanner:");
        int y = sc.nextInt();

        System.out.println(x>y?"the max num is:"+x:"the max num is:"+y);

        System.out.println("the message you entered is:"+x);

    }
}
