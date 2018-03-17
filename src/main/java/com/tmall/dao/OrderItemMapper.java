package com.tmall.dao;

import com.tmall.pojo.OrderItem;

/**
 * 订单明细表
 */
public interface OrderItemMapper {

    /**
     * 根据主键删除订单明细
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入订单明细表所有主键
     * @param record
     * @return
     */
    int insert(OrderItem record);

    /**
     * 插入订单明细表非空主键
     * @param record
     * @return
     */
    int insertSelective(OrderItem record);

    /**
     * 根据主键查询订单明细
     * @param id
     * @return
     */
    OrderItem selectByPrimaryKey(Integer id);

    /**
     * 更新订单明细表非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(OrderItem record);

    /**
     * 更新订单明细表所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(OrderItem record);

}