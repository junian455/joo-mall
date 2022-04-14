package com.jaron.joomall.product.web;

import com.jaron.joomall.product.service.SkuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>Title: ItemController</p>
 * Description：
 * date：2020/6/24 13:20
 */
@Controller
public class ItemController {

	@Autowired
	private SkuInfoService skuInfoService;

//	@RequestMapping("/{skuId}.html")
//	public String skuItem(@PathVariable("skuId") Long skuId, Model model) throws ExecutionException, InterruptedException {
//
//		SkuItemVo vo = skuInfoService.item(skuId);
//
//		model.addAttribute("item", vo);
//		return "item";
//	}
}
