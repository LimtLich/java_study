package com.company.JAVA基础笔记7;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Object[] toArray()
 * 把集合转成数组，可以实现对集合的遍历
 * */

public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");//向上转型：Object b = "hello"
		c.add("world");
		c.add("java");

		Object[] o = c.toArray();
		for (int x = 0; x < o.length; x++) {
			String s = (String) o[x];// 向下转型
			System.out.println(s + "-----" + s.length());
		}
	}
}
