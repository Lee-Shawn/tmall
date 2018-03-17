package com.tmall.dao;

import com.tmall.pojo.User;

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

}