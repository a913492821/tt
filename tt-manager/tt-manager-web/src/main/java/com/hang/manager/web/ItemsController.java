package com.hang.manager.web;

import com.hang.manager.pojo.dto.ItemsList;
import com.hang.manager.pojo.dto.PageBean;
import com.hang.manager.pojo.vo.TbItemCustom;
import com.hang.manager.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/items",method = RequestMethod.GET)
    @ResponseBody
    public ItemsList<TbItemCustom> findItems(PageBean pageBean){

        return itemsService.findItems(pageBean);
    }
}
