package com.wellington.dscatalogSpring.repositories;


import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.wellington.dscatalogSpring.entities.Product;

@DataJpaTest
public class ProductRepositoryTests {
	@Autowired
	private ProductRepository repository;
	
	@Test
	public void deletShouldDeleteObjectWhenIdExists() {
		
		long existingId = 1L;
		repository.deleteById(existingId);
		
		Optional<Product> result = repository.findById(existingId); 
		Assertions.assertFalse(result.isPresent());
		
		
		
	}
	

}
