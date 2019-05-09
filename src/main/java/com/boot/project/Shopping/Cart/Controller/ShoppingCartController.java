package com.boot.project.Shopping.Cart.Controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.boot.project.Shopping.Cart.Dto.ProductDto;

@RequestMapping(value = "/api")
public interface ShoppingCartController {
	@RequestMapping(value = "/get/{productName}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ProductDto getProductInfo(@PathVariable String productName);

	@RequestMapping(value = "/delete/product", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
	public ProductDto deleteProduct(@RequestBody List<Integer> productId);

	/*@RequestMapping(value = "/update/{productName}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
	public ProductDto updateProductInfo(String productName);*/
}
