package com.company.JAVA基础笔记3;

import java.util.Scanner;

interface interx {
	void show();
}

class Outerxx {

	public static interx method() {
		return new interx() {
			public void show() {
				int num = 20;
				System.out.println(num);
			}
		};
	}

}

public class 匿名内部类Test {
	public static void main(String[] args) { 
		// 因为method()方法可以继续调方法，所以method()必有返回值，非void
		Outerxx.method().show();// 输出hello world!
		Scanner s = new Scanner(System.in);
	}
}
