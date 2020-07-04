package com.tz.leo.spring.dao;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/7/4 16:53
 * Content:
 */
public interface BaseDao<T> {
    public void save(T t);

    public void update(T t);

    public void delete(String id);

    public List<T> findAll();

    public T findOne(String id);

    //参数1:起始条数   参数2:每页的记录数
    public List<T> findByPage(Integer start,Integer row);

    //查询总条数
    public Long findTotals();

}
