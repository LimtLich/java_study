package com.company.JAVA基础笔记2;

/*
 * final可以修饰类，方法，变量
 * */

/*final fu1{
	final类无法被继承，最终类无子类
}
*/

class fu1{
	final void show() {
		System.out.println("private fu");
	}
}

class zi1 extends fu1{
	//无法重写父类final方法
	/*public void show() {
		System.out.println("public zi");
	}*/
}

public class 关键字final {
	public static void main(String[] args) {
		zi1 a = new zi1();
		a.show();
	}
}
