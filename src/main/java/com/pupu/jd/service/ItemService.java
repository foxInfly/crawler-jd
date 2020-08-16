package com.pupu.jd.service;

import com.pupu.jd.pojo.Item;

import java.util.List;

/**
 * @author : lipu
 * @since : 2020-08-16 17:51
 */
public interface ItemService {


    /**
     * 保存商品
     * @author lipu
     * @since 2020/8/16 17:51
     */
    public void save(Item item);


    /**
     * 根据条件查询所有商品
     * @author lipu
     * @since 2020/8/16 17:53
     */
    public List<Item> findAll(Item item);

}
