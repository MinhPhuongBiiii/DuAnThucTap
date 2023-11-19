package com.example.demo.service.impl;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
import com.example.demo.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public Category detail(Long id) {
        return categoryRepository.getReferenceById(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }


    @Override
    public MessageUtil save(Category dto) {
        if (categoryRepository.existsByName(dto.getName())){
            return MessageUtil.builder().status(0).message("Thêm thất bại vì tên danh mục đã có !").type("bg-danger").build();
        }else {
            categoryRepository.save(dto);
            return MessageUtil.builder().status(1).message("Thêm thành công !").type("bg-success").build();
        }
    }

}
