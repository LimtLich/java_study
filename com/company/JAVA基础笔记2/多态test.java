package com.company.JAVA基础笔记2;

class Animal2{
	public void eat(){
		System.out.println("eatting");
	}
}

class Dog2 extends Animal2{
	public void eat(){
		System.out.println("dog is eatting");
	}
	public void lookdoor() {
		System.out.println("looking door");
	}
}

class Cat2 extends Animal2{
	public void eat(){
		System.out.println("cat is eatting");
	}
	public void playGame(){
		System.out.println("playing game");
	}
}

public class 多态test {
	public static void main(String[] args) {
		//定义为Dog
		Animal2 a = new Dog2();
		a.eat();
		System.out.println("--------------");
		//还原为Dog
		Dog2 b = (Dog2)a;
		b.lookdoor();
		System.out.println("--------------");
		//变成Cat
		a = new Cat2();
		a.eat();
		System.out.println("--------------");
		//还原为Cat
		Cat2 c = (Cat2)a;
		c.playGame();
		System.out.println("--------------");
		Dog2 x = (Dog2)a;
		x.lookdoor();//ClassCastException:类型转换异常，一般发生在多态的向下转型
	}
}
