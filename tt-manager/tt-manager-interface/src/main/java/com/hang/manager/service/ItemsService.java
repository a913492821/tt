package com.hang.manager.service;

import com.hang.manager.pojo.dto.ItemsList;
import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.vo.TbItemCustom;

public interface ItemsService {
    ItemsList<TbItemCustom> findItems(PageBean pageBean);
}
