package com.pupu.jd.dao;

import com.pupu.jd.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : lipu
 * @since : 2020-08-16 17:50
 */
public interface ItemDao extends JpaRepository<Item,Long> {

}
