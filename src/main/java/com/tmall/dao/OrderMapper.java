package com.tmall.dao;

import com.tmall.pojo.Order;

/**
 * 订单表
 */
public interface OrderMapper {

    /**
     * 根据主键删除订单
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入订单表所有字段
     * @param record
     * @return
     */
    int insert(Order record);

    /**
     * 插入订单表非空字段
     * @param record
     * @return
     */
    int insertSelective(Order record);

    /**
     * 根据主键查询订单
     * @param id
     * @return
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * 更新订单表非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * 更新订单表所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(Order record);

}