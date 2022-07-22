 package com.phone.service;

import java.util.List;

import com.phone.bean.Business;


public interface BusinessService {

	public List<Business> list();
	
	public int delete(int id);
}
