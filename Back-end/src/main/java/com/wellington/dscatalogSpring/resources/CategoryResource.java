package com.wellington.dscatalogSpring.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.wellington.dscatalogSpring.DTO.CategoryDTO;
import com.wellington.dscatalogSpring.services.CategoryService;;

@RestController
@RequestMapping (value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<Page<CategoryDTO>> findAll(
			
			@RequestParam(defaultValue = "0") Integer page,
			@RequestParam(defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "ASC") String direction,
			@RequestParam(value = "direction", defaultValue = "name") String orderBy
			){
		
		PageRequest pagerequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction),orderBy  );
		
		
		Page <CategoryDTO> list = service.findAllPaged(pagerequest);
		
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryDTO> findById(@PathVariable Long id){
		CategoryDTO  dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
    }
	@PostMapping
	public ResponseEntity<CategoryDTO> insert(@RequestBody CategoryDTO dto ){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
		
	}
	@PutMapping(value = "/{id}")
	public ResponseEntity<CategoryDTO> update(@PathVariable Long id, @RequestBody CategoryDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
		
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<CategoryDTO> delete(@PathVariable Long id ){
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}
}
