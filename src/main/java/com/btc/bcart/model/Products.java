package com.btc.bcart.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Products {
	
	private String productName;
	private String productDesc;
	private String productPrice;
	private String productColor;
	private String productSize;
	private String productImgPaht;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public String getProductImgPaht() {
		return productImgPaht;
	}
	public void setProductImgPaht(String productImgPaht) {
		this.productImgPaht = productImgPaht;
	}

}
