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

    /**
     * 找回密码的提示问题
     * @param username
     * @return
     */
    ServerResponse<String> selectQuestion(String username);

    /**
     * 提示问题与答案
     * @param username
     * @param question
     * @param answer
     * @return
     */
    ServerResponse<String> checkAnswer(String username, String question, String answer);

    /**
     * 重置密码（忘记密码）
     * @param username
     * @param passwordNew
     * @param forgetToken
     * @return
     */
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 重置密码（登录状态）
     * @param passwordOld
     * @param passwordNew
     * @param user
     * @return
     */
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    /**
     * 更新个人信息
     * @param user
     * @return
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 校验用户是否是管理员
     * @param user
     * @return
     */
    ServerResponse checkAdminRole(User user);
}
