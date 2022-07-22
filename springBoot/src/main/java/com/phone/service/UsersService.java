package com.phone.service;

import java.util.List;

import com.phone.bean.Users;

public interface UsersService {
   //用户登录
	public Users login(Users users);
	
	//用户更改
	public Users update(Users users);
	
	public boolean reg(Users users);
	
	public List<Users>list();
}
