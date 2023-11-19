package com.example.demo.service;


import com.example.demo.entity.TypeProduct;
import com.example.demo.util.MessageUtil;

import java.util.List;

public interface TypeProductService {

    MessageUtil save(TypeProduct typeProduct);

    Object detail(Long id);

    List<TypeProduct> getAll();
}
