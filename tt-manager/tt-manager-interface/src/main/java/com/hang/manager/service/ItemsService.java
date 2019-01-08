package com.hang.manager.service;

import com.hang.manager.pojo.dto.ItemsList;
import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.po.TbItem;

public interface ItemsService {
    ItemsList<TbItem> findItems(PageBean pageBean);
}
