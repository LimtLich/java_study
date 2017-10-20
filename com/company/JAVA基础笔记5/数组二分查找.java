package com.company.JAVA基础笔记5;

/*
* 二分查找:(折半查找)
*       前提:数组必须是有序的
*
*       实现:
*           A:定义最小索引,最大索引
*           B:计算中间索引
*           C:拿中间索引的值和要查找的元素进行比较:
*                   相等:就直接返回当前的中间索引
*                   不相等:
*                       大于中间值:在右边找
*                       小于中间值：在左边找
*            D:重写获取最小索引或最大索引
*                   大于中间值:在右边找
*                   	min = mid + 1
*                           max = mid -1
*                   小于中间值：在左边找 
*                   		min = mid + 1
*                           
*                           
*  注：当数组为无序数组时，不可使用二分查找法，即使是先排序也不行，因为排序过后数组的原始索引已被改变
* */

public class 数组二分查找 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        System.out.println("the index is:"+getIndex(arr, 66));
        System.out.println("the index is:"+getIndex(arr, 177));
    }

    public static int getIndex(int[] arr, int i) {
        int min = 0;
        int max = arr.length - 1;
        //恒获得有序数组的中间值
        int mid = (max + min) / 2;
        //拿中间索引值和要查找的值进行比对
        while (i != arr[mid]) {
        	//大于中间值
            if (i > arr[mid]) {
            	//因为是大于，下次查找不包括中间值，所以+1
            	min = mid + 1;       
            } else {
            	//因为是小于，下次查找不包括中间值，所以-1
            	max = mid - 1;
            }
            
            //加入判断，当数值不存在时
            if(min>max) {
            	return -1;
            }
            
            //重新计算中间值
            mid = (max + min) / 2;
        }
        return mid;
    }
}
