package org.Elkarts.ElecBoot;

import java.sql.Blob;

import com.mongodb.Block;

public class Products {

	private String Id;
	private String productName;
	private Blob productImage;
	private String productDescription;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Blob getProductImage() {
		return productImage;
	}
	public void setProductImage(Blob productImage) {
		this.productImage = productImage;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Products(String id, String productName, Blob productImage, String productDescription) {
		super();
		Id = id;
		this.productName = productName;
		this.productImage = productImage;
		this.productDescription = productDescription;
	}
	public Products() {
		super();
	}
	@Override
	public String toString() {
		return "Products [Id=" + Id + ", productName=" + productName + ", productImage=" + productImage
				+ ", productDescription=" + productDescription + "]";
	}
	
	
	
	
}
