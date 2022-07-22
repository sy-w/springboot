package com.phone.service;

import java.util.List;

import com.phone.bean.Product;

public interface ProductService {
	public List<Product> list();
	
	public int update(Product product);
	
	public void delete(Product product);
	
	public List<Product> list2(Product product);
	
	public int car(Product product);
}
