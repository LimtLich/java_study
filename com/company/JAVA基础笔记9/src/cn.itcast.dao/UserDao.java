package com.company.JAVA基础笔记9.src.cn.itcast.dao;
import com.company.JAVA基础笔记9.src.cn.itcast.pojo.User;
/**
 * 用户操作接口
 * @author mingtao.li
 * @version v1.0
 * */
public interface UserDao {
    /**
     * @param username 用户名
     * @param  password　密码
     * @return 返回是否成功登录
     * */
    public abstract boolean login(String username, String password);

    /**
     * @param user 注册用户信息
     * @return 返回是否成功注册
     * */

    public abstract boolean regist(User user);
}


