package com.boot.project.Shopping.Cart.Controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.project.Shopping.Cart.Controller.ShoppingCartController;
import com.boot.project.Shopping.Cart.Dto.ProductDto;
import com.boot.project.Shopping.Cart.Service.ShoppingCartService;

@RestController
public class ShoppingCartControllerImpl implements ShoppingCartController {
	private static final Logger log = LoggerFactory.getLogger(ShoppingCartControllerImpl.class);

	@Autowired
	ShoppingCartService shoppingcartService;

	@Override
	public ProductDto getProductInfo(@PathVariable("productName") String productName) {
		log.debug("Product Dto getPrductInfo() starts");
		ProductDto productDto = new ProductDto();
		productDto = shoppingcartService.getProductDetails(productName);
		return productDto;
	}

	@Override
	public ProductDto deleteProduct(@RequestBody List<Integer> productId) {
		
		return null;
	}

}
