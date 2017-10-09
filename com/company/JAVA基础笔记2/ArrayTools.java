package com.company.JAVA基础笔记2;
/**
 * 数组操作工具类
 * @author MING
 * @version 1.0
 * 目录格式：javadoc -d 目录 -author -version ArrayTool.java
 */
public class ArrayTools {
    //把构造方法私有，外界就不能再创建对象了
    private  ArrayTools(){};
    //工具类中方法，变量皆静态化，就可以直接通过静态访问
    /**
     * 遍历数组
     * @param arr 被遍历的数组
     */
    public static void printArray(int[] arr){
        for(int a = 0;a<arr.length;a++){
            if(a==arr.length-1){
                System.out.print(arr[a]);
            }else{
                System.out.print(arr[a]+",");
            }
        }
    }
    /**
     * 获取数组最大值
     * @param arr 被查找的数组
     * @return 返回数组中最大值
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int a = 0;a<arr.length;a++){
            if(arr[a]>max){
                max = arr[a];
            }
        }
        return max;
    }
    /**
    * 获取指定元素在数组中第一次出现的索引，如果元素不存在，则返回-1
    * @param arr 被查找的数组
    * @param value 要查找的元素
    * @return 返回元素在数组中的索引，不存在则返回-1
    */
    public static int getIndex(int[] arr,int value){
        int index = -1;
        for(int a = 0;a<arr.length;a++){
            if(arr[a] == value){
                index = a;
                //适时跳出循环
                break;
            }
        }
        return index;
    }

}
