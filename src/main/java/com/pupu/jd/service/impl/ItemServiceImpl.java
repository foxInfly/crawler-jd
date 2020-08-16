package com.pupu.jd.service.impl;

import com.pupu.jd.dao.ItemDao;
import com.pupu.jd.pojo.Item;
import com.pupu.jd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : lipu
 * @since : 2020-08-16 17:53
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;



    @Override
    public void save(Item item) {
        this.itemDao.save(item);
    }

    @Override
    public List<Item> findAll(Item item) {
        //声明查询条件
        Example<Item> example = Example.of(item);

        //根据条件查询
        List<Item> list = this.itemDao.findAll(example);


        return list;
    }
}
