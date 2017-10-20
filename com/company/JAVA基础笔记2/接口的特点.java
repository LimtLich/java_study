package com.company.JAVA基础笔记2;

/*
 * 接口的特点：
 * A：接口用关键字interface表示
 * 		interface 接口名{}
 * B:类实现接口用implements表示
 * 		class 类名  implements接口名{}
 * C:接口不能实例化，按照多态的方式实例化。
 * D：接口的子类：
 * 		a:可以是抽象类，意义不大（仍无法实例）
 * 		b:可以是具体类，要重写接口中的所有抽象方法。（推荐方案）
 * 
 * 多态实用性：
 * A：具体类多态（几乎没有）
 * B:抽象类多态（常用）
 * C:接口多态（最常用！！！）
 * */


//定义接口：动物训练接口
interface animalTrain{
	public abstract void jump() ;
}
//抽象类实现接口，意义不大
abstract class dog44 implements animalTrain{
	
}
//具体类dog4实现接口
class dog4 implements animalTrain{
	//重写接口抽象方法
	public void jump() {
		System.out.println("dog can jump!");
	}
}


public class 接口的特点 {
	public static void main(String[] args) {
		animalTrain ac = new dog4();
		ac.jump();
	}
}
