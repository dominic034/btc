package com.btc.bcart.mongo.init;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.btc.bcart.model.Catalog;
import com.btc.bcart.model.Products;


public class InitMongoServiceImp implements InitMongoService {
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void init() {
		
		Catalog catalog = new Catalog();
		catalog.setId(1);
		catalog.setName("Zart");
		catalog.setUniqUrlname("zartlarin-gücü");
		
		List<Products> products = new ArrayList<Products>();
		Products product= new Products(); 
		product.setProductColor("Siyah");
		product.setProductDesc("Siyah Kolibant en iyisi");
		product.setProductName("Koli Banti");
		product.setProductPrice("10 TL");
		product.setProductImgPaht("asdasd");
		products.add(product);
		
		
		Products product2= new Products(); 
		product.setProductColor("Kirmizi");
		product.setProductDesc("Kirmizi Kolibant en iyisi");
		product.setProductName("Koli Banti");
		product.setProductPrice("10 TL");
		product.setProductImgPaht("asdasd");
		products.add(product2);
		
		Products product3= new Products(); 
		product.setProductColor("Mor");
		product.setProductDesc("Mor Kolibant en iyisi");
		product.setProductName("Koli Banti");
		product.setProductPrice("10 TL");
		product.setProductImgPaht("asdasd");
		products.add(product3);
		
		catalog.setProducts(products);
		
		
		
		Catalog catalog2 = new Catalog();
		catalog.setId(1);
		catalog.setName("Zurt");
		catalog.setUniqUrlname("zurtlarin-gücü");
		
		List<Products> products2 = new ArrayList<Products>();
		Products product4= new Products(); 
		product.setProductColor("Siyah");
		product.setProductDesc("Siyah Kalem en iyisi");
		product.setProductName("Kalem Banti");
		product.setProductPrice("10 TL");
		product.setProductImgPaht("asdasd");
		products.add(product4);
		
		
		Products product5= new Products(); 
		product.setProductColor("Kirmizi");
		product.setProductDesc("Kirmizi Kalem en iyisi");
		product.setProductName("Kalem Banti");
		product.setProductPrice("10 TL");
		product.setProductImgPaht("asdasd");
		products.add(product5);
		
		Products product6= new Products(); 
		product.setProductColor("Mor");
		product.setProductDesc("Mor Kalem en iyisi");
		product.setProductName("Kalem Banti");
		product.setProductPrice("10 TL");
		product.setProductImgPaht("asdasd");
		products.add(product6);
		
		catalog.setProducts(products2);
		
		mongoTemplate.save(catalog);
		
		
		
		
		
	
	}
}