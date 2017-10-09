package com.company.world;
import com.company.hello.CarScanner;
public class ShowScanner {
    public static void main(String[] args){
        int sum = 100;
        int flowers = 0;
        while(sum>=100&&sum<=999){
            int ge = sum%10;
            int shi = sum/10%10;
            int bai = sum/100%10;
            if(((ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai))==sum){
                flowers++;
            }
            sum++;
        }
        System.out.println("flowers are:"+flowers);
        for(int x = 0;x<5;x++){
            for(int y=0;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int x = 1;x<=9;x++){
            for(int y = 1;y<=x;y++){
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
        CarScanner newScanner = new CarScanner();
        newScanner.enterScanner();
    }
}
