package com.FPR360.service;

import com.FPR360.Model.Category;
import com.FPR360.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category addData(Category category){
        this.categoryRepository.save(category);

        return category;
    }
    public List<Category> listData(){
        return  categoryRepository.findAll();
    }
}
