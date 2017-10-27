package com.company.JAVA基础笔记8;

import java.util.ArrayList;

public class ArrayList集合嵌套存储遍历元素 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Student>> bigArrayList = new ArrayList<ArrayList<Student>>();
		// 插入第一子集合
		ArrayList<Student> firstArrayList = new ArrayList<Student>();
		Student s1 = new Student("mike", 19);
		Student s2 = new Student("jack", 21);
		Student s3 = new Student("jay", 23);

		firstArrayList.add(s1);
		firstArrayList.add(s2);
		firstArrayList.add(s3);

		bigArrayList.add(firstArrayList);
		// 插入第二子集合
		ArrayList<Student> secondArrayList = new ArrayList<Student>();
		Student s4 = new Student("jam", 15);
		Student s5 = new Student("iron", 20);
		Student s6 = new Student("pit", 17);

		secondArrayList.add(s4);
		secondArrayList.add(s5);
		secondArrayList.add(s6);

		bigArrayList.add(secondArrayList);
		// 插入第三子集合
		ArrayList<Student> thirdArrayList = new ArrayList<Student>();
		Student s7 = new Student("yek", 20);
		Student s8 = new Student("lucy", 21);
		Student s9 = new Student("bron", 24);

		thirdArrayList.add(s7);
		thirdArrayList.add(s8);
		thirdArrayList.add(s9);

		bigArrayList.add(secondArrayList);

		for (ArrayList<Student> list : bigArrayList) {
			for (Student s : list) {
				System.out.println(s.getName() + "-------" + s.getAge());
			}
		}

	}
}
