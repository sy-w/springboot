package com.phone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.bean.Business;
import com.phone.dao.BusinessDao;
import com.phone.service.BusinessService;

@Service
public class BusinessServiceImpl implements BusinessService{

	@Autowired
	BusinessDao businessDao;

	@Override
	public List<Business> list() {
		return businessDao.list();
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return businessDao.delete(id);
	}

}