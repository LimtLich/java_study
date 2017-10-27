package com.company.JAVA基础笔记6;

import java.util.Scanner;

public class 正则表达式 {
    public static void main(String[] args) {
        //校验键盘录入的手机号
        Scanner scPhone = new Scanner(System.in);
        String phone = scPhone.nextLine();
        String regexPhone = "1[38]\\d{9}";//首位数为1，次位数为3或8，其余全部为数字，总长度为（11 - （首位数1+次位数2）=9）
        System.out.println(phone.matches(regexPhone));

        //校验邮箱
        Scanner scMail = new Scanner(System.in);
        String main = scMail.nextLine();
        //前面由不规则单词字符组成（[a-zA-Z_0-9]），出现多次（+），加上@号（@），后为2~6位单词字符（[a-zA-Z_0-9]{2,6}），后跟若干.com或.com.cn（(\.[a-zA-Z_0-9]{2,3})+）
        String regexMail = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}(\\.[a-zA-Z_0-9]{2,3})+";
        //改进：单词字符可简写未（\w），数字可简写为\d，\w或者\d在实际使用时应加转义符，即：\\w  \\d
        String regexMail2 = "\\w+@\\w{2,6}(\\.\\w{2,3})+";
        System.out.println(main.matches(regexMail));
        System.out.println(main.matches(regexMail2));
    }
}
