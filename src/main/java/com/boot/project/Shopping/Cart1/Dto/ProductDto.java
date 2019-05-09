package com.boot.project.Shopping.Cart.Dto;

public class ProductDto {
	private String productId;
	private String ProductPrice;
	private String productName;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductDto [productId=");
		builder.append(productId);
		builder.append(", ProductPrice=");
		builder.append(ProductPrice);
		builder.append(", productName=");
		builder.append(productName);
		builder.append("]");
		return builder.toString();
	}
	

}
