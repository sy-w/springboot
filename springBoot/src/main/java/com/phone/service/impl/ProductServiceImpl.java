package com.phone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phone.bean.Product;
import com.phone.dao.ProductDao;
import com.phone.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;

	@Override
	public List<Product> list() {
		return productDao.list();
	}

	@Override
	public List<Product> list2(Product product) {
		return productDao.list2(product);
	}
	@Override
	public int update(Product product) {
	 
	 return productDao.update(product);
	}

	@Override
	public void delete(Product product) {
	 
	 productDao.delete(product);
	}

	@Override
	public int car(Product product) {
		
		return productDao.car(product)
;	}
}
