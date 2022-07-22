package com.phone.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.phone.bean.Product;
import com.phone.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;

	// 查询所有商品信息并返回给前端页面进行显示
	@RequestMapping("/list")
	@ResponseBody // 设置当前方法返回类型格式为json格式
	public List<Product> list() {
		System.out.println("controller被执行.....");
		return productService.list();
	}
	
	// 查询部分商品信息并返回给前端页面进行显示
		@RequestMapping("/list2")
		@ResponseBody // 设置当前方法返回类型格式为json格式
		public List<Product> list2(Product product) {
//			productService.list2(product);
//			System.out.println("controller被执行.....");
			System.out.println(product.getName()+"???????");
			return productService.list2(product);
		}

	/**
	 * 更新客户
	 */
	@RequestMapping("/update1")
	public ModelAndView productupdate(Product product) {
		System.out.println(product.getName()+"-----");
	        productService.update(product);
	        productService.car(product);
	        ModelAndView mv =new ModelAndView();
	        mv.addObject("n", product.getName());
			mv.setViewName("cart");
	        return mv;
	}

}
