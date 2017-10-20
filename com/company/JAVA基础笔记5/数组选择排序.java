package com.company.JAVA基础笔记5;

/*
* 选择排序：
*       从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引出，其他的同理，即可得到一个排好序的数组
*       每次比对后，最小值移出比对数列
*       （最后一次是数组长度-2的元素和数组长度-1的元素进行比较）
* */

public class 数组选择排序 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 14, 16, 2, 3, 20, 11};
        char[] ch = {'a','c','d','b'};
        System.out.println("排序前：");
        printArray(ch);
        System.out.println("排序后：");
        selectSort(ch);
        printArray(ch);
    }

    //遍历
    public static void printArray(char[] arr) {
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

    //选择排序
    public static void selectSort(char[] arr) {
        for (int index = 0; index < arr.length - 1; index++) {
            for (int num = index + 1; num < arr.length; num++) {
                if (arr[index] > arr[num]) {
                    char temp = arr[index];
                    arr[index] = arr[num];
                    arr[num] = temp;
                }
            }
        }
    }
}
