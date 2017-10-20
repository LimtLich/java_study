package com.company.JAVA基础笔记3;

public class 权限修饰符总结__Text {
    /*
    * 权限修饰符：
    *                       本类           同一个包下（子类和无关类）          不同包下（子类）     不同包下（无关类）
    *       private          Y                  X                                   X                   X
    *       默认             Y                  Y                                   X                   X
    *       protected        Y                  Y                                   Y                   X
    *       public           Y                  Y                                   Y                   Y
    * */


    /*-----------------------------------------------------------------------------------------------------------------------*/


    /*
    * 类：
    *   权限修饰符：默认修饰符，public
    *   状态修饰符：final
    *   抽象修饰符：abstract
    *
    *   最常用：public
    *
    * 成员变量：
    *   权限修饰符：private，默认，protected，public
    *   状态修饰符：static，final
    *
    *   最常用：private
    *
    * 构造方法：
    *   权限修饰符：private，默认，protected，public
    *
    *   最常用：public
    *
    * 成员方法：
    *   权限修饰符：private，默认，protected，public
    *   状态修饰符：static，final
    *   抽象修饰符：abstract
    *
    *   最常用：public
    *
    * 常见组合规则：
    *       成员变量：public static final
    *       成员方法：public static
    *                 public abstract
    *                 oublic final
    * */
}
