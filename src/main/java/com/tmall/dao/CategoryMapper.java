package com.tmall.dao;

import com.tmall.pojo.Category;

/**
 * 分类表
 */
public interface CategoryMapper {

    /**
     * 根据主键删除分类
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入分类表所有字段
     * @param record
     * @return
     */
    int insert(Category record);

    /**
     * 插入分类表非空字段
     * @param record
     * @return
     */
    int insertSelective(Category record);

    /**
     * 根据主键查询分类表
     * @param id
     * @return
     */
    Category selectByPrimaryKey(Integer id);

    /**
     * 更新分类表非空字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * 更新分类表所有字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(Category record);

}