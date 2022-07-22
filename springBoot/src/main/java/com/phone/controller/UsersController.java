package com.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phone.bean.Product;
import com.phone.bean.Users;
import com.phone.service.UsersService;

@Controller
public class UsersController {
	//获取服务层对象注入
	@Autowired
	UsersService usersService;
	
	@RequestMapping("/login")//设置当前方法的请求路径
	public String login(Users users) {
//		System.out.println("name="+users.getUsername());
		if (usersService.login(users) == null) {
			return "redirect:error.html";
		}
		return "redirect:index.html";
	}
	
	@RequestMapping("/update")
	public String update(Users users) {
		if (usersService.update(users) == null) {
			return "redirect:error.html";
			
		}
		return "redirect:用户管理.html" ;
		
	}
	
	// 查询所有商品信息并返回给前端页面进行显示
		@RequestMapping("/list4")
		@ResponseBody // 设置当前方法返回类型格式为json格式
		public List<Users> list() {
			System.out.println("controller被执行.....");
			return usersService.list();
		}

}
