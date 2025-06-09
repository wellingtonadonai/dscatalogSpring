package com.wellington.dscatalogSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.dscatalogSpring.entities.Category;
import com.wellington.dscatalogSpring.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List <Category> findAll(){
		
		return repository.findAll();
		
		
	}

}
