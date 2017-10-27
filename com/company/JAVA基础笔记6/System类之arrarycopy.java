package com.company.JAVA基础笔记6;

import java.util.Arrays;

public class System类之arrarycopy {
    public static void main(String[] args) {
        int[] i = {1, 3, 5, 7, 9};
        int[] i2 = {2, 4, 6, 8, 10};
        //从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
        System.arraycopy(i, 2, i2, 3, 2);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(i2));
    }
}
