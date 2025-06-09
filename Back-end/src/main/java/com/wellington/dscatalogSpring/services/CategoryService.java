package com.wellington.dscatalogSpring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellington.dscatalogSpring.DTO.CategoryDTO;
import com.wellington.dscatalogSpring.entities.Category;
import com.wellington.dscatalogSpring.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional (readOnly = true)
	public List <CategoryDTO> findAll(){
		
		List<Category> list = repository.findAll();
		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
		
		
		
		
		//List<CategoryDTO> listDTO = new ArrayList<>();
		//for(Category cat : list) {
		//listDTO.add(new CategoryDTO(cat));
		//}
		
		
	}

}
