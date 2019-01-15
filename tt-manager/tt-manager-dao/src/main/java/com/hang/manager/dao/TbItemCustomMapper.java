package com.hang.manager.dao;

import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.vo.TbItemCustom;

import java.util.List;

public interface TbItemCustomMapper {
    Long countItems();

    List<TbItemCustom> findItems(PageBean pageBean);
}
