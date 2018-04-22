package com.tmall.dao;

import com.tmall.pojo.Product;

import java.util.List;

/**
 * 产品表
 */
public interface ProductMapper {

    /**
     * 根据主键删除产品
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入产品表所以字段
     * @param record
     * @return
     */
    int insert(Product record);

    /**
     * 插入产品表非空字段
     * @param record
     * @return
     */
    int insertSelective(Product record);

    /**
     * 根据主键查询产品
     * @param id
     * @return
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * 更新产品表非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * 更新产品表所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(Product record);

    /**
     * 获取所有产品
     * @return
     */
    List<Product> getList();

}