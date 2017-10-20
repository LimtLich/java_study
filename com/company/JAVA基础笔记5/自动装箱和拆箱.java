package com.company.JAVA基础笔记5;

/*
* JDK5后出现：
*   自动装箱：把基本类型转换为包装类类型
*   自动拆箱：把包装类类型转换为基本类型
*
*   注：在使用时，若Integer x = null了上面的代码就会出现NullPointerException（空指针异常），因为空对象无法调方法
*       需要先进行非空判断
*
*   注2：Integer的数据直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据
* */

public class 自动装箱和拆箱 {
    public static void main(String[] args) {

        //针对-128到127之间的数据，做了一个数据缓冲池，如果数据是该范围内的，每次并不创建新空间，否则会重新new一个
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        Integer ii1 = 128;
        Integer ii2 = 128;
        System.out.println(ii1 == ii2);//128超出了范围，重新new了一个空间，所以不相等


        boxDemo(100);
    }

    public static void boxDemo(Integer i) {
        //非空检测
        if (i != null) {
            i += 200;
            System.out.println("i:" + i);
        }

    }
}
