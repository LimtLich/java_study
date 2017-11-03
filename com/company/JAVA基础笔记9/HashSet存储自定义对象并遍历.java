package com.company.JAVA基础笔记9;

/*
 * HashSet底层结构为哈希表：是一个元素为链表的数组。综合了数组（查询快）和链表的好处（增删快）
 * 而哈希表结构底层依赖：hashCode（）和equals（）方法
 * 若定义成员变量值相同即为同一个对象，应重写这两个方法（可自动生成）
 * */

import java.util.HashSet;

public class HashSet存储自定义对象并遍历 {
	public static void main(String[] args) {
		HashSet<Student> st = new HashSet<Student>();

		Student s1 = new Student("mike", 18);
		Student s2 = new Student("james", 30);
		Student s3 = new Student("kity", 20);
		Student s4 = new Student("james", 30);
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);

		for (Student s : st) {
			System.out.println(s);
		}
	}
}
