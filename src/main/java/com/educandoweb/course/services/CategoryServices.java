package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;


@Service
public class CategoryServices {
    
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category FindById(long id) {
		Optional<Category> obj = repository.findById(id);
	    return obj.get();
		
	}
}
   