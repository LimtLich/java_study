package com.company.JAVA基础笔记5;

public class StringBuffer删除功能 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world");

		// deletr by charAt
		sb.deleteCharAt(2);
		sb.deleteCharAt(2);
		System.out.println("sb:" + sb);
		sb.delete(0, sb.length());
		System.out.println("sb:" + sb);
	}
}
