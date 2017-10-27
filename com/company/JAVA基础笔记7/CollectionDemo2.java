package com.company.JAVA基础笔记7;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c)：判断集合中是否包含指定的集合元素
 * boolean containsAll(Collection c):判断集合中是否包含指定的集合元素
 * boolean retainAll(Collection c):两个集合都有的元素
 * */

public class CollectionDemo2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("1a");
		c1.add("2a");
		c1.add("3a");
		c1.add("4a");
		Collection c2 = new ArrayList();
		c2.add("3a");
		c2.add("4a");
		c2.add("5a");
		c2.add("6a");

		//System.out.println("addAll:"+c1.addAll(c2));//增加,可任意添加，结果为true
		
		//System.out.println("removeAll:"+c1.removeAll(c2));//只要有一个元素被移除了，就返回true
		
		//System.out.println("containsAll:"+c1.containsAll(c2));//只有包含了所有元素，才返回true
		
		//假设有两个集合A,B
		//A对B做交集，最终的结果保存在A中，B不变
		//返回值表示的是A是否发生过改变
		System.out.println("retainAll"+c1.retainAll(c2));//返回交集部分

		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
	}
}
