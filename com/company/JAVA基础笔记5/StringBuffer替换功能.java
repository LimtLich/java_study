package com.company.JAVA基础笔记5;

/*
 * public StringBuffer replace(int start,int end,String str)
 * 		从start到end用str替换之
 * */

public class StringBuffer替换功能 {
	public static void main(String[] args) {
		//
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world");
		sb.replace(5,10,"apple!");
		System.out.println(sb);
	}
}
