package com.tmall.dao;

import com.tmall.pojo.PayInfo;

/**
 * 支付信息表
 */
public interface PayInfoMapper {

    /**
     * 根据主键删除支付信息
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入支付信息表所有字段
     * @param record
     * @return
     */
    int insert(PayInfo record);

    /**
     * 插入支付信息表非空字段
     * @param record
     * @return
     */
    int insertSelective(PayInfo record);

    /**
     * 根据主键查询支付信息
     * @param id
     * @return
     */
    PayInfo selectByPrimaryKey(Integer id);

    /**
     * 更新支付信息表非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(PayInfo record);

    /**
     * 更新支付信息表所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(PayInfo record);

}