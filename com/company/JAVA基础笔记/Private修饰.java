package com.company.JAVA基础笔记;

/*
* Private 是一个权限修饰符
* 可以修饰成员（成员变量和成员方法）
* 被private修饰的成员只在本类中才能访问
* */

/*
* Private常见应用
* 把成员变量用private修饰
* 提供对应的getXXX()/setXxx()方法
* */

class Snow{
    private int iceNum = 999;
    public void showIce(){
        System.out.println(iceNum);
    }
}

public class Private修饰 {
    public static void main(String[] args){
        Snow a = new Snow();
        a.showIce();
    }
}
