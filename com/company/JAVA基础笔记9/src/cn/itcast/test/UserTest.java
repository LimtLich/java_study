package com.company.JAVA基础笔记9.src.cn.itcast.test;

import com.company.JAVA基础笔记9.src.cn.itcast.dao.UserDao;
import com.company.JAVA基础笔记9.src.cn.itcast.dao.impl.UserDaoImpl;
import com.company.JAVA基础笔记9.src.cn.itcast.game.GuessNumber;
import com.company.JAVA基础笔记9.src.cn.itcast.pojo.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        while (true) {
            System.out.println("----------欢迎使用天网系统----------");
            System.out.println("请选择您要进行的操作：");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            UserDao ud = new UserDaoImpl();//多态

            switch (choice) {
                case "1":
                    System.out.println("请输入登录账号：");
                    String username = sc.nextLine();
                    System.out.println("请输入登录密码：");
                    String password = sc.nextLine();

                    boolean successLogin = ud.login(username, password);
                    if (!successLogin) {
                        System.out.println("账号或密码错误！");
                    } else {
                        System.out.println("登录成功，欢迎进入系统");
                        System.out.println("请输入身份码（数字）：");
                        GuessNumber.play();
                        System.exit(0);
                        //break;//这里写break，结束的是switch
                    }
                    break;
                case "2":
                    System.out.println("请输入注册账号：");
                    String newUsername = sc.nextLine();
                    System.out.println("请输入注册密码：");
                    String newPassword = sc.nextLine();

                    User user = new User();
                    user.setUsername(newUsername);
                    user.setPassword(newPassword);

                    boolean successRegist = ud.regist(user);
                    if (!successRegist) {
                        System.out.println("注册失败，用户已存在！");
                    } else {
                        System.out.println("注册成功！");
                    }
                    break;
                case "3":
                default:
                    System.out.println("感谢使用天网，再见");
                    //终止程序
                    System.exit(0);
                    break;
            }
        }
    }
}
