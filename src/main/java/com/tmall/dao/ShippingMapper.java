package com.tmall.dao;

import com.tmall.pojo.Shipping;

/**
 * 收货地址表
 */
public interface ShippingMapper {

    /**
     * 根据主键删除收货地址
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入收货地址表所有字段
     * @param record
     * @return
     */
    int insert(Shipping record);

    /**
     * 插入收货地址表非空字段
     * @param record
     * @return
     */
    int insertSelective(Shipping record);

    /**
     * 根据主键查询收货地址
     * @param id
     * @return
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * 更新收货地址表非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Shipping record);

    /**
     * 更新收货地址表所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(Shipping record);

}