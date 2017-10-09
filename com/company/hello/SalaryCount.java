package com.company.hello;

public class SalaryCount {

    public static void main(String[] args){
        int[][] allSalary = {{22,26,44},{77,33,88},{25,45,65},{11,66,99}};
        int sum = 0;
        for(int x = 0;x<allSalary.length;x++){
            for(int y = 0;y<allSalary[x].length;y++){
                sum+=allSalary[x][y];
            }
        }
        System.out.println(sum);
    }
}
