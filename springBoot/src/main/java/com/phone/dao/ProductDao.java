package com.phone.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.phone.bean.Product;

@Mapper
public interface ProductDao {

	public List<Product> list();
	
	public int update(Product product);
	
	public void delete(Product product);
	
	public List<Product> list2(Product product);
	
	public int car(Product product);
}
