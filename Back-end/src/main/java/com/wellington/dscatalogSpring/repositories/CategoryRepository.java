package com.wellington.dscatalogSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellington.dscatalogSpring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
