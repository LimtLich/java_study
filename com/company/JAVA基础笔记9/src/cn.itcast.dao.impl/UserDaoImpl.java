package com.company.JAVA基础笔记9.src.cn.itcast.dao.impl;

import com.company.JAVA基础笔记9.src.cn.itcast.dao.UserDao;
import com.company.JAVA基础笔记9.src.cn.itcast.pojo.User;

import java.util.ArrayList;

/**
 * 用户操作具体实现类（集合版）
 * @author mingtao.li
 * @version  v1.0
 * */

public class UserDaoImpl implements UserDao {
    //私有集合，不允许外界访问
    //为了让多个对象共享一个成员变量，使用static（被修饰的数据被所有对象共有）2
    private static ArrayList<User> userList = new ArrayList<User>();

    public boolean login(String username, String password) {
        boolean flag = false;
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                flag = true;
            }
        }
        return flag;
    }

    //注册
    public boolean regist(User user) {
        boolean flag = false;
        if (!userList.contains(user)) {
            userList.add(user);
            flag = true;
        }
        return flag;
    }
}
