package com.example.demo.service;


import com.example.demo.entity.Category;
import com.example.demo.util.MessageUtil;

import java.util.List;

public interface CategoryService {

    Category detail(Long id);

    List<Category> getAll();

    MessageUtil save(Category category);

}
