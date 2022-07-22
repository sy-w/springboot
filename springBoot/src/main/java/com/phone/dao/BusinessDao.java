package com.phone.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.phone.bean.Business;

@Mapper
public interface BusinessDao {
	//查询所有商户
	public List<Business>list();
	
	public int delete(int id);

}
