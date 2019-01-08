package com.itheima.dao;

import com.itheima.domain.Items;

/**
 * 定义一个接口，根据id查询记录
 */
public interface ItemsDao {
    /**
     *根据id查询记录
     * @param id
     * @return
     */
    public Items findById(Integer id);


}
