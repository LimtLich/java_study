package com.company.JAVA基础笔记8;

interface inter<T> {
    void show(T t);
}

class interImp<T> implements inter<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}

public class 泛型接口 {
    public static void main(String[] args) {
        inter<String> i = new interImp<String>();
        i.show("hello");
        i.show("world");

        inter<Integer> ii = new interImp<Integer>();
        ii.show(100);
    }
}
