package com.company.JAVA基础笔记;

class computer{
    private String brand;
    private int price;

    public computer(){
        System.out.println("无参构造方法");
    }
    public computer(String brand,int price){
        System.out.println("有参构造方法");
        this.brand = brand;
        this.price = price;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void show(){
        System.out.println("Computer brand:"+brand+",computer price:"+price);
    }
}

public class 类的标准 {

        public static void main(String[] args){
            computer c = new computer();
            computer s = new computer("Acer",6999);
            System.out.println(s.getBrand());
            s.setBrand("Dell");
            s.setPrice(7999);
            s.show();
        }

}
