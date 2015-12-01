package com.btc.bcart.repository;

import java.util.List;

import com.btc.bcart.model.Products;

public interface ProductRepository {

	
	List <Products> getAllProduct();
	Products getAllProductById(String ID);

}
