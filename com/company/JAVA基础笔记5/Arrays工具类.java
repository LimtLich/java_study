package com.company.JAVA基础笔记5;

import java.util.Arrays;

public class Arrays工具类 {
	public static void main(String[] args) {
		int[] arr = { 8, 7, 5, 3, 1 };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 5));
	}
}
