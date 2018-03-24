package com.tmall.service;

import com.tmall.common.ServerResponse;
import com.tmall.pojo.User;

/**
 * 用户接口
 */
public interface IUserService {

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 用户注册
     * @param user
     * @return
     */
    ServerResponse<String> register(User user);

    /**
     * 校验用户名和邮箱
     * @param str
     * @param type
     * @return
     */
    ServerResponse<String> checkValid(String str, String type);
}
