package com.company.JAVA基础笔记8;

import java.util.ArrayList;
import java.util.Collection;

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}

public class 泛型之通配符 {
    public static void main(String[] args) {
        //泛型如果明确的写的时候，前后必须一致
        Collection<Object> c1 = new ArrayList<Object>();
        //Collection<Object> c2 = new ArrayList<Animal>();错误，前后不一致

        //<?>表示任意的类型都可以
        Collection<?> c3 = new ArrayList<Animal>();
        Collection<?> c4 = new ArrayList<Dog>();
        Collection<?> c5 = new ArrayList<Cat>();

        // <?extends E>：向下限定，E及其子类
        Collection<? extends Animal> c6 = new ArrayList<Animal>();
        Collection<? extends Animal> c7 = new ArrayList<Dog>();
        Collection<? extends Animal> c8 = new ArrayList<Cat>();

        //<?extends E>：向上限定，E及其父类
        Collection<? super Animal> c9 = new ArrayList<Object>();//父类
        Collection<? super Animal> c10 = new ArrayList<Animal>();//自身
        //Collection<? super Animal> c11 = new ArrayList<Dog>();//子类
        //Collection<? super Animal> c12 = new ArrayList<Cat>();//子类
    }
}
