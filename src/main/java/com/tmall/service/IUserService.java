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
}
