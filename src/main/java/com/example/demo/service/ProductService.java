package com.example.demo.service;


import com.example.demo.dto.ProductDto;
import com.example.demo.dto.ProductRequest;
import com.example.demo.entity.Product;
import com.example.demo.util.MessageUtil;

import java.util.List;

public interface ProductService {

    ProductRequest getProduct(Long id);

    MessageUtil add(ProductRequest product);

    Product detail(Long id);

    List<ProductDto> getAll(String status, Long category, Long type, Long brand);


    MessageUtil update(ProductRequest request, Long id);

    MessageUtil save(Long id);

}
