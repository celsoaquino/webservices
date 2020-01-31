package com.cra.webservices.services;

import com.cra.webservices.entities.Category;
import com.cra.webservices.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj = categoryRepository.findById(id);
       return obj.get();
    }
}
