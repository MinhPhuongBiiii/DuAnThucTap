package com.example.demo.service;


import com.example.demo.entity.Brand;
import com.example.demo.util.MessageUtil;

import java.util.List;

public interface BrandService {

    Brand detail(Long id);

    List<Brand> getAll();

    MessageUtil save(Brand brand );
}
