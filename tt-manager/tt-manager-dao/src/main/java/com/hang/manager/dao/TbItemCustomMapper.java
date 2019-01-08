package com.hang.manager.dao;

import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.po.TbItem;

import java.util.List;

public interface TbItemCustomMapper {
    Long countItems();

    List<TbItem> findItems(PageBean pageBean);
}
