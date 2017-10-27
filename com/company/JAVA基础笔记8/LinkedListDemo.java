package com.company.JAVA基础笔记8;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList s = new LinkedList();
		s.add("hello");
		s.add("world");
		s.add("java");

		s.removeFirst();
		s.addFirst("javaee");
		s.removeLast();
		s.addLast("javase");
		
		System.out.println(s);
	}
}
