package com.phone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.bean.Product;
import com.phone.bean.Users;
import com.phone.dao.UsersDao;
import com.phone.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	UsersDao usersDao;
	@Override
	public Users login(Users users) {
		// TODO Auto-generated method stub
		return usersDao.findByName(users);
	}
	@Override
	public boolean reg(Users users) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Users update(Users users) {
		// TODO Auto-generated method stub
		return usersDao.update(users);
	}
	@Override
	public List<Users> list() {
		return usersDao.list();
	}
}
