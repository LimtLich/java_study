package com.company.JAVA基础笔记2;

/*
 * A：抽象类中不一定有抽象方法，但有抽象方法的类一定是抽象类
 * B：抽象类无法实例化，因为其不是具体的
 * C：抽象类有构造方法但无法实例化
 * 	    抽象类中的构造方法用于给子类访问父类的初始化数据
 * D：抽象类的子类：
 *		子类为抽象类：不重写父类抽象方法时，子类需同为抽象类
 *		子类为具体类：子类为一个具体类时，需重写所有父类中的抽象方法
 * E:抽象类的实例化：抽象类的实例化是靠具体的子类实现的，是多态的方式
 * F:多态中方法的重写主要用于抽象类，子类重写父类方法用以具体实现
 * G：抽象类中的抽象方法是强制子类要做的事情，非抽象方法是给子类继承的		
 * */

abstract class animal3{
	//public abstract void eat() {}; 空方法体会报错，抽象方法不能存在主体
	public abstract void eat();
	public animal3() {}
}

abstract class dog3 extends animal3{
	
}

class cat3 extends animal3{
	//重写父类抽象方法
	public void eat() {
		System.out.println("dog eat rice!I eat fish!");
	}
}

public class 抽象类 {
	public static void main(String[] args) {
		//animal3 a = new animal3();抽象类无法实例化
		animal3 a = new cat3();//通过多态实例化
		a.eat();
	}
}
