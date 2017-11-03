package com.company.JAVA基础笔记9;

import java.util.TreeSet;

/*
 * TreeSet：能够对元素按照某种规则进行败絮
 * 排序有两种方式：
 * 	A：自然排序
 * 	B：比较器排序
 * */

public class TreeSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		//默认构造为自然顺序排序
		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(10);
		t.add(20);
		t.add(5);
		t.add(8);
		t.add(2);
		t.add(19);
		t.add(5);
		t.add(8);
		t.add(2);

		for (Integer i : t) {
			System.out.println(i);
		}

	}
}
