package com.company.JAVA基础笔记6;

import java.util.Scanner;

public class MathRandom之任意范围取随机数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数：");
		int start = sc.nextInt();
		System.out.println("请输入结束数：");
		int end = sc.nextInt();

		for (int x = 0; x < 100; x++) {
			// System.out.println(getRandom(start, end));
			System.out.println(Math.random() * 100);
		}
	}

	public static int getRandom(int start, int end) {
		// return (int) (Math.random() * 100 + 1);
		return (int) (Math.random() * (end - start) + 1);//起始值不能大于边界值，所以是（end - start），需要涵盖边界，所以+1
	}
}
