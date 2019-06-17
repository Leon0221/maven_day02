package com.itheima.contorller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsContorller {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping(value = "/findById")
    public ModelAndView findById(int id,ModelAndView modelAndView){
        Items item  = itemsService.findById(id);
        modelAndView.setViewName("show");
        modelAndView.addObject("item",item);
        return modelAndView;
    }
}
