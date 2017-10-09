package com.company.hello;

import java.util.Scanner;

public class YangHui__triangle {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int [][] numRecord = new int[n][];
        for(int x = 0;x<numRecord.length;x++){
            numRecord[x] = new int[x+1];
            numRecord[x][0] = 1;
            numRecord[x][x] = 1;
            for(int y = 2;y<numRecord[x].length;y++){
                numRecord[x][y-1] = numRecord[x-1][y-2] + numRecord[x-1][y-1];
            }
        }

        for(int a = 0;a<numRecord.length;a++){
            System.out.println();
            for(int b = 0;b<numRecord[a].length;b++){
                System.out.print(numRecord[a][b]+"\t");
            }
        }

    }
}
