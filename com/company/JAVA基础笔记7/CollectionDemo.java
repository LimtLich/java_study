package com.company.JAVA基础笔记7;

import java.util.ArrayList;
import java.util.Collection;

/*
* 集合与数组的区别：
*       A：长度区别
*               数组长度固定
*               集合长度可变
*       B：内容不同
*               数组存储的是同一种类型的元素
*               而集合可以存储不同类型的元素
*       C：元素的数据类型问题
*               数组可以存储基本数据类型，也可以存储引用数据类型
*               集合只能存储引用类型
*               
*               
* Collection:是集合的顶层接口，它的子体系有重复的，有唯一的，有有序的，有无序的
* 	功能概述：
* 		1.添加功能
* 			boolean add(E obj):添加一个元素
* 			boolean addAll(Collection c):添加一个集合的元素
* 		2.删除功能
* 			void clear():移除所有元素----不推荐
* 			boolean remove(E o)：移除一个元素
* 			boolean removeAll(Collection c)：移除一个元素集合
* 		3.判断功能
* 			boolean contains(E o):判断集合中是否包含指定的元素
* 			boolean containsAll(Collection c):判断集合中是否包含指定的集合元素
* 			boolean isEmpty():判断集合是否为空
* 		4.获取功能
* 			Iterator<E> iterator() -----重点
* 		5.长度功能
* 			int size();元素个数
* 		6.交集功能
* 			boolean retainAll(Collection c):两个集合都有的元素
* 		7.把集合转换为数组
* 			E[] toArray()
* */
public class CollectionDemo {
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add("hello");
		c.add("world");

		// c.clear();清除所有元素

		c.remove("world");

		System.out.println("contains:" + c.contains("hello"));
		System.out.println("not contains:" + c.contains("java"));

		System.out.println("size:" + c.size());

		System.out.println("List:" + c);	
	}
}
