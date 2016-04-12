package com.junsom.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.junsom.common.page.Pageable;

/**
 * 通用DAO
 * 
 * @Version: 1.0
 * @Author: hejunsong 何俊松
 * @Email: hjsactivity@gmail.com
 * @Date: 2016年4月11日
 */
public interface ICommonDao<T> {
  
  /**
   * 添加记录
   * 
   * @param entity
   * @return
   */
  Integer insert(T entity);
  
  /**
   * 根据id删除记录
   * 
   * @param id
   * @return
   */
  Integer deleteById(Long id);
  
  /**
   * 根据id集合删除记录
   * 
   * @param ids
   * @return
   */
  Integer deleteByIds(@Param("ids") List<Long> ids);
  
  /**
   * 更新记录
   * 
   * @param entity
   * @return
   */
  Integer update(T entity);

  /**
   * 根据主键查找
   * 
   * @param id
   * @return
   */
  T selectById(Long id);
  
  /**
   * 根据entity中的值查询, 不包含空值
   * 
   * @param entity
   * @return
   */
  List<T> selectByEntityCondition(T entityCondition);
  
  /**
   * 根据实体中的条件分页查询
   * 
   * @param entityCondition
   * @param pageNumber
   *          查询页
   * @param pageSize
   *          每页记录数
   * @return
   */
  List<T> selectByEntityConditionPage(@Param("entityCondition") T entityCondition, @Param("pageable") Pageable pageable);
}
