package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 * 商品管理 Service 接口
 * @author ghy
 *
 */
public interface ItemService {

	public TbItem queryItemById(Long itemId);
}
