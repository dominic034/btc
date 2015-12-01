package com.btc.bcart.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Catalog {
	
	private long id;
	private String name;
	private String  uniqUrlname;
	
	private List<Products> products;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniqUrlname() {
		return uniqUrlname;
	}

	public void setUniqUrlname(String uniqUrlname) {
		this.uniqUrlname = uniqUrlname;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}
	

}
