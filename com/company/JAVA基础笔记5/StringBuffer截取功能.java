package com.company.JAVA基础笔记5;

/*
 * StringBuffer的截取功能：注意返回值类型不再是StringBuffer本身了而是String类
 * public String subString(int start)
 * public String subString(int start,int end)
 * */

public class StringBuffer截取功能 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world");

		System.out.println("sb:" + sb);
		String s = sb.substring(5);
		System.out.println("s:" + s);
		//本身没有发生改变
		System.out.println("sb:" + sb);
	}
}
