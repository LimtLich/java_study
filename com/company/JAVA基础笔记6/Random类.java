package com.company.JAVA基础笔记6;

/*
 * 构造方法：
 * public Random():没有给种子，默认种子是当前时间的毫秒值
 * public Random(long seed)：给出指定的种子
 * 成员方法：
 * public int nextInt():返回的是int范围内的随机数
 * public int nextInt(int n):返回得失(0,n)范围内的随机数
 * */

import java.util.Random;

public class Random类 {
	public static void main(String[] args) {
		Random r = new Random();
		//指定种子
		Random r2 = new Random(1);
		int a = r.nextInt(11);
		//指定种子的随机数每次的值都是固定的
		int b = r2.nextInt(12);
		System.out.println(a);
		System.out.println(b);
	}
}
