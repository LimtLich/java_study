package com.company.JAVA基础笔记8;

import java.util.ArrayList;
import java.util.Random;

public class 获取10个1到20之间的不重复随机数 {
	public static void main(String[] args) {

		Random r = new Random();

		ArrayList<Integer> randomList = new ArrayList<Integer>();

		for (int x = 0; x < 10; x++) {
			int ranNum = r.nextInt(20) + 1;
			if (!randomList.contains(ranNum)) {
				randomList.add(ranNum);
			}
		}

		for (int num : randomList) {
			System.out.println(num);
		}
	}
}
