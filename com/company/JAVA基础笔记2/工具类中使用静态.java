package com.company.JAVA基础笔记2;

public class 工具类中使用静态 {
    public static void main(String[] args){
        int[] arr = {5,9,7,18,22};
        //ArrayTools array = new ArrayTools();
        //静态访问静态
        //遍历
        ArrayTools.printArray(arr);
        //获取最值
        int max = ArrayTools.getMax(arr);
        System.out.println("max:"+max);
        //获取下标
        int index = ArrayTools.getIndex(arr,9);
        System.out.println("index:"+index);
    }

}
