package com.btc.bcart.repository.mock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.btc.bcart.model.Catalog;
import com.btc.bcart.model.Products;
import com.btc.bcart.repository.CatalogRepository;

@Repository
public class CatalogRepositoyImpl implements CatalogRepository{

	@Override
	public List<Catalog> getAllCatalog() {

		List<Catalog> cataloglist = new ArrayList<Catalog>();
		

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
		catalog2.setId(2);
		catalog2.setName("Zurt");
		catalog2.setUniqUrlname("zurtlarin-gücü");
		
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
		
		catalog2.setProducts(products2);
		
		cataloglist.add(catalog);
		cataloglist.add(catalog2);
		
		return cataloglist;
	}



	@Override
	public List<Products> getCatalogByViewId(String viewID) {
		
		List<Catalog>  allcatalog = getAllCatalog();
		List<Products>  returnProduct = new ArrayList<Products>();
		
		for (Iterator iterator = allcatalog.iterator(); iterator.hasNext();) {
			Catalog catalog = (Catalog) iterator.next();
			String eqString = catalog.getName()+"-"+catalog.getId();
			
			if(eqString.equals(viewID)){
				returnProduct = catalog.getProducts();
			}
			
		}
		return returnProduct;
	}


	
	
}
