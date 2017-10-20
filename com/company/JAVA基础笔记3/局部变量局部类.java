package com.company.JAVA基础笔记3;

/*
* 局部内部类：
*       A：可以直接访问外部类的成员
*       B：在局部位置，可以创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
*
* 局部内部类访问局部变量的注意事项：
*       A：局部内部类访问局部变量必须用final修饰
*               局部变量是随着方法的调用而调用，随着调用完毕而消失。
*               而对内存的内容并不会立即消失，所以，需要添加final修饰。
*               加入final修饰后，这个变量就成为了常量
*               常量即使消失之后，内存中存储的数据是20，所以数据依然有效存在
* */

class outer3{
        private int num1 = 10;
        public void method(){
            //局部内部类访问局部变量必须用final修饰
            final int num2 = 20;
            class inner3{
                public void show(){
                    System.out.println(num1);
                    //从内部类中访问本地变量num2；需要被生命为最终类型
                    System.out.println(num2);

                }
            }
            //创建内部类对象，通过对象调用内部类方法，来使用局部内部类功能
            inner3 i = new inner3();
            i.show();
        }

}

public class 局部变量局部类 {
    public static void main(String[] args){
        outer3 o = new outer3();
        o.method();
    }
}
