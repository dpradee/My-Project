package com.boot.project.Shopping.Cart.Service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.boot.project.Shopping.Cart.Dto.ProductDto;
import com.boot.project.Shopping.Cart.Service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	private static final Logger log = LoggerFactory.getLogger(ShoppingCartServiceImpl.class);

	@Override
	public ProductDto getProductDetails(String productName) {
		log.debug("ShoppingCartServiceImpl getProductDetailsStarts");

		return null;
	}

}
