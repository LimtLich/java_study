 package com.company.JAVA基础笔记8;

class Car<T>{
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}

public class 泛型类概述及使用 {
    public static void main(String[] args) {
        Car<String> carBrand = new Car<String>();
        carBrand.setInfo("TOYOTA");
        System.out.println("Car brand is:"+carBrand.getInfo());

        Car<Integer> carPrice = new Car<Integer>();
        carPrice.setInfo(100000);
        System.out.println("Car price is:"+carPrice.getInfo());
    }
}
