package com.hang.manager.service;

import com.hang.manager.pojo.dto.ItemsList;
import com.hang.manager.pojo.dto.ItemsQuery;
import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.vo.TbItemCustom;

import java.util.List;

public interface ItemsService {
    ItemsList<TbItemCustom> findItems(PageBean pageBean, ItemsQuery itemsQuery);

    Integer deleteItems(List<Long> ids);
}
