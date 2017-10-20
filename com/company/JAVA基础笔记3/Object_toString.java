package com.company.JAVA基础笔记3;

/*
 * public String toString(){}
 * 		建议所有子类重写该方法:把该类所有成员变量值组成返回（name:xxx,age:xxx）
 * 		自动重写：alt+shift+s -> source -> toString
 * */

class ObjectTar{
	private String name = "Mike";
	private int age = 15;
	@Override
	public String toString() {
		return "ObjectTar [name=" + name + ", age=" + age + "]";
	}
	
}

public class Object_toString {
	public static void main(String[] args) {
		ObjectTar j = new ObjectTar();
		System.out.println(j.hashCode());
		System.out.println(j.getClass().getName());
		//equals to toString()
		System.out.println(j.getClass().getName()+"@"+Integer.toHexString(j.hashCode()));
		
		System.out.println(j.toString());
		//equals to toString()
		System.out.println(j);
	}
}
	