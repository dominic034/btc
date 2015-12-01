package com.btc.bcart.repository;

import java.util.List;

import com.btc.bcart.model.Catalog;
import com.btc.bcart.model.Products;


public interface CatalogRepository  {
	
	List <Catalog> getAllCatalog();
	List<Products> getCatalogByViewId(String viewID);

}
