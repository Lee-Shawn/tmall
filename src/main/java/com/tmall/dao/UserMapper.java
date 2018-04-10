package com.tmall.dao;

import com.tmall.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户表
 */
public interface UserMapper {

    /**
     * 根据主键删除用户
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入用户表所有字段
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 插入用户表非空字段
     * @param record
     * @return
     */
    int insertSelective(User record);

    /**
     * 根据主键查询用户
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 更新用户表非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 更新用户表所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    /**
     * 校验用户名是否存在
     * @param username
     * @return
     */
    int checkUsername(String username);

    /**
     * 校验用户邮箱
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 校验登录时用户名和密码是否正确
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查找问题
     * @param username
     * @return
     */
    String selectQuestionByUsername(String username);

    /**
     * 校验提示问题的答案
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /**
     * 根据用户名更新密码
     * @param username
     * @param passwordNew
     * @return
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    /**
     * 校验当前密码
     * @param password
     * @param userId
     * @return
     */
    int checkPassword(@Param("password") String password, @Param("userId") Integer userId);

}