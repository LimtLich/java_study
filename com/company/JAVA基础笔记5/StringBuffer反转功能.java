package com.company.JAVA基础笔记5;

public class StringBuffer反转功能 {
	public static void main(String[] args) {
		//创建字符串缓冲区
		StringBuffer sb = new StringBuffer();
		//添加数据
		sb.append("!doog si ABN");
		//反转
		sb.reverse();
		System.out.println(sb);
		System.out.println("---------------------");
		String s = "!OGOGOG";
		System.out.println(myReverse(s));
	}

	public static String myReverse(String s){
		return new StringBuffer(s).reverse().toString();
	}
}
