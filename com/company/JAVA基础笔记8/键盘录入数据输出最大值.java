package com.company.JAVA基础笔记8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 键盘录入数据输出最大值 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		System.out.println("please enter a number:");
		Scanner sc = new Scanner(System.in);
		int nextNum = sc.nextInt();
		while (nextNum != 0) {
			numList.add(nextNum);
			System.out.println("please enter the next number:");
			nextNum = sc.nextInt();
		}

		Integer[] arr = new Integer[numList.size()];
		Integer[] arrList = numList.toArray(arr);

		Arrays.sort(arrList);

		System.out.println("Max num is:" + arrList[arrList.length - 1]);
	}
}
