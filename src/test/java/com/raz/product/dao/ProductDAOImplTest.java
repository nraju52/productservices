package com.raz.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.raz.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("Galaxy");
		product.setDescription("Virus Is A Threat Challenge");
		product.setPrice(2);

		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Galaxy", result.getName());

	}

}
