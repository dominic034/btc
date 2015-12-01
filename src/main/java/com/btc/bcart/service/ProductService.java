package com.btc.bcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.bcart.model.Catalog;
import com.btc.bcart.model.Products;
import com.btc.bcart.repository.mock.CatalogRepositoyImpl;
import com.btc.bcart.repository.mock.ProductRepositoyImpl;

@Service
public class ProductService {
	
private CatalogRepositoyImpl catalogRepository = new CatalogRepositoyImpl();
private ProductRepositoyImpl productRepository = new ProductRepositoyImpl();


  public List <Catalog> getAllCatalog(){
	return catalogRepository.getAllCatalog();
  }
  
  public List <Products> getPopularProduts(){
	return productRepository.getAllProduct();
  }
  public List <Products> getProductsbyCatagory(String viewID){
		return catalogRepository.getCatalogByViewId(viewID);
	  }
  
  public Products getProdut(){
	  return null;
  }
  
 
  
  
  


 

	
}
