package com.hang.manager.dao;

import com.hang.manager.pojo.dto.ItemsQuery;
import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.vo.TbItemCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCustomMapper {
    Long countItems(@Param("itemsQuery") ItemsQuery itemsQuery);

    List<TbItemCustom> findItems(@Param("pageBean")PageBean pageBean,@Param("itemsQuery") ItemsQuery itemsQuery);
}
