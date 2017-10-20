package com.company.JAVA基础笔记5;

/*
* 冒泡排序：
*       相邻元素两两比较，大的往后放，第一次完毕后，最大值就出现在了最大索引处，同理，继续，即可得到以恶搞排序好的数组
*       每次比对后，最大值移出比对数列
*       （总共需要比较数组长度-1次）
* */

public class 数组冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {23, 4, 11, 64, 21, 6, 9};
        System.out.println("排序之前：");
        printArray(arr);

        System.out.println("排序之后：");
        bubbleSort(arr);
        printArray(arr);
    }

    //遍历
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int num = 0; num < arr.length; num++) {
            if (num == arr.length - 1) {
                System.out.print(arr[num]);
            } else {
                System.out.print(arr[num] + ",");
            }
        }
        System.out.println("]");
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        //arr.length -1 是为了防止数据月结
        //arr.length-1-times是为了减少比较的次数（无需再次对最大值进行比对）
        for (int times = 0; times < arr.length - 1; times++) {
            for (int num = 0; num < arr.length - 1 - times; num++) {
                if (arr[num] > arr[num + 1]) {
                    int temp = arr[num];
                    arr[num] = arr[num + 1];
                    arr[num + 1] = temp;
                }
            }
        }
    }
}
