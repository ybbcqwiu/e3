package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 商品管理 Controller
 * @author ghy
 *
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@ResponseBody
	@RequestMapping("/showItemById")
	public TbItem showItemById(@RequestParam("itemId") Long itemId){
		TbItem item = itemService.queryItemById(itemId);
		return item;
	}
	
	
}
