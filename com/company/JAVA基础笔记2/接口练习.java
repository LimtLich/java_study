package com.company.JAVA基础笔记2;

/*
 * 分析：由具体到抽象
 * 实现：由抽象到具体
 * */

interface Smoke{
	public abstract void smoke();
}

abstract class human{
	public String name;
	public int age;
	public human() {}
	public human(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public abstract void eat();
	public void sleep() {
		System.out.println("sleeping!!");
	}
}

class teacher extends human{
	public teacher() {}
	public teacher(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("teacher eat rice!!");
	}
}

class teacherSmoker extends teacher implements Smoke{
	public void smoke() {
		System.out.println("i am smoking!!");
	}
}

class student extends human{
	public student() {}
	public student(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("student eat noodel!!");
	}
}

public class 接口练习 {
	public static void main(String[] args) {
		human a = new teacher("Zhang",35);
		System.out.println("I'm"+a.name+","+a.age+"years old!");
		a.eat();
		a.sleep();
		System.out.println("----------------------");
		human b = new student("Li",20);
		System.out.println("I'm"+b.name+","+b.age+"years old!");
		b.eat();
		b.sleep();
		System.out.println("----------------------");
		teacherSmoker c = new teacherSmoker();
		c.smoke();
	}
}
