/**
 * 
 */
package com.boot.project.Shopping.Cart.Service;

import com.boot.project.Shopping.Cart.Dto.ProductDto;

/**
 * @author M1046717
 *
 */
public interface ShoppingCartService {
	ProductDto getProductDetails(String productName);
}
