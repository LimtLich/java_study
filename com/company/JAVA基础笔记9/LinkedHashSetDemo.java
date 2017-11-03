package com.company.JAVA基础笔记9;

/*
 * LinkedHashSet：底层数据结构由哈希表和链表组成
 * 哈希表保证元素唯一性。
 * 链表保证元素有序（存储和取出是一致）
 * */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lt = new LinkedHashSet<String>();

		lt.add("hello");
		lt.add("world");
		lt.add("java");
		lt.add("world");
		lt.add("java");

		for (String s : lt) {
			System.out.println(s);
		}
	}
}
