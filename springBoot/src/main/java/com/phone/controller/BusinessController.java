package com.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phone.bean.Business;
import com.phone.bean.Product;
import com.phone.service.BusinessService;

@Controller
public class BusinessController {
	@Autowired
	BusinessService businessService;

	// 查询所有商品信息并返回给前端页面进行显示
	@RequestMapping("/list3")
	@ResponseBody // 设置当前方法返回类型格式为json格式
	public List<Business> list() {
		System.out.println("controller被执行.....");
		return businessService.list();
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void delete(int id) {
		System.out.println(id);
		int i = businessService.delete(id);
	}
}
