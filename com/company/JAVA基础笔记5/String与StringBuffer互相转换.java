package com.company.JAVA基础笔记5;

public class String与StringBuffer互相转换 {
	public static void main(String[] args) {
		System.out.println("-------String转StringBuffer----------");
		String s = "hello";
		// 方法1
		StringBuffer sb = new StringBuffer(s);
		System.out.println("sb:" + sb);
		// 方法2
		StringBuffer sb2 = new StringBuffer();
		sb2.append(s);
		System.out.println("sb2:" + sb2);

		System.out.println("-------StringBuffer转String----------");
		// 方法1:
		StringBuffer buffer = new StringBuffer("java");
		String s3 = new String(buffer);
		System.out.println("s3:" + s3);
		// 方法2：任何引用类型调用toString()都会返回字符串类型值
		String s4 = buffer.toString();
		System.out.println("s4:"+s4);
	}
}
