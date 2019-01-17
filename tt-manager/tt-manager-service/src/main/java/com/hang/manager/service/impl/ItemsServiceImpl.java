package com.hang.manager.service.impl;

import com.hang.manager.dao.TbItemCustomMapper;
import com.hang.manager.dao.TbItemMapper;
import com.hang.manager.pojo.dto.ItemsList;
import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.po.TbItem;
import com.hang.manager.pojo.po.TbItemExample;
import com.hang.manager.pojo.vo.TbItemCustom;
import com.hang.manager.service.ItemsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private TbItemCustomMapper tbItemCustomMapper;
    @Autowired
    private TbItemMapper tbItemMapper;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ItemsList<TbItemCustom> findItems(PageBean pageBean) {

        ItemsList<TbItemCustom> list = new ItemsList<>();
        list.setCode(0);
        list.setMsg("success");
        try {
            Long count = tbItemCustomMapper.countItems();
            list.setCount(count);
            List<TbItemCustom> items = tbItemCustomMapper.findItems(pageBean);
            list.setData(items);

        }catch (Exception e){
            list.setCode(1);
            list.setMsg("fail");
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Integer deleteItems(List<Long> ids) {
        TbItem tbItem = new TbItem();
        tbItem.setStatus((byte) 3);
        TbItemExample tbItemExample = new TbItemExample();
        TbItemExample.Criteria criteria = tbItemExample.createCriteria();
        criteria.andIdIn(ids);
        return tbItemMapper.updateByExampleSelective(tbItem,tbItemExample);
    }
}
