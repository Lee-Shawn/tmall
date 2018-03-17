package com.tmall.dao;

import com.tmall.pojo.Cart;

/**
 * 购物车表
 */
public interface CartMapper {

    /**
     * 根据主键删除购物车内容
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入购物车表所有字段
     * @param record
     * @return
     */
    int insert(Cart record);

    /**
     * 插入购物车非空字段
     * @param record
     * @return
     */
    int insertSelective(Cart record);

    /**
     * 根据主键查询购物车内容
     * @param id
     * @return
     */
    Cart selectByPrimaryKey(Integer id);

    /**
     * 更新购物车非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * 更新购物车所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(Cart record);

}