package com.company.JAVA基础笔记5;

import com.company.JAVA基础笔记2.ArrayTools;

public class StringBuffer数组拼接为指定字符串 {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		System.out.println(ArrayToString(arr));
	}
	
	public static String ArrayToString(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int num = 0;num<arr.length;num++) {
			if(num == arr.length-1) {
				sb.append(arr[num]).append("]");
			}else {
				sb.append(arr[num]).append(",");
			}
		}
		return sb.toString();
	}
}
