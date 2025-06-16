package com.wellington.dscatalogSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellington.dscatalogSpring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product , Long> {
	

}
