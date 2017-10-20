package com.company.JAVA基础笔记4;

import java.util.Scanner;

import com.company.JAVA基础笔记2.super类;

class user {
	private String account = "admin";
	private String password = "123";

	public boolean check() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入账号：");
		String account = s.nextLine();
		System.out.println("请输入密码：");
		String password = s.nextLine();

		if (account.equals(this.account) && password.equals(this.password)) {
			System.out.println("success login!!");
			return true;
		} else {
			return false;
		}
	}

	public void login() {
		int chance = 3;
		System.out.println("请输入账号及密码，您共有3次机会！");
		//此处使用while,同时可用for实现
		while (chance > 0) {
			if (check()) {
				GuessNumber.start();
				break;
			} else {
				chance -= 1;
				if (chance == 0) {
					System.out.println("输入有误，登录失败！");
				}else {
					System.out.println("请重新输入账号及密码，剩余" + chance + "次机会！");
				}
				
			}
		}
	}

}

public class String判断及登录实例 {
	public static void main(String[] args) {
		String s1 = "helloword";
		String s2 = "helloword";
		String s3 = "HellowWorld";
		String s4 = "";
		String s5 = null;

		System.out.println("equals:" + s1.equals(s2));
		System.out.println("equalsIgnoreCase:" + s1.equalsIgnoreCase(s3));
		System.out.println("contains exist:" + s1.contains("hellow"));
		System.out.println("contains not exist:" + s1.contains("ew"));// contains是连体检测
		System.out.println("Start with:" + s3.startsWith("H"));
		System.out.println("Start with:" + s3.startsWith("h"));
		System.out.println("End with：" + s2.endsWith("qw"));
		System.out.println("End with:" + s2.endsWith("ord"));
		System.out.println("Empty:" + s4.isEmpty());
		// System.out.println("Empty:"+s5.isEmpty());//null调用方法报错，空对象引用

		System.out.println("-----------------------------");
		user u = new user();
		u.login();
	}
}
