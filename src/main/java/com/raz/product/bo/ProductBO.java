package com.raz.product.bo;

import com.raz.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	public Product findProduct(int id);

}
