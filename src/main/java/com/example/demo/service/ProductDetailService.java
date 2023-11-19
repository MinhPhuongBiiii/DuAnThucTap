package com.example.demo.service;


import com.example.demo.entity.ProductDetail;
import com.example.demo.util.MessageUtil;

import java.math.BigDecimal;
import java.util.List;

public interface ProductDetailService {

    void add(ProductDetail productDetail);

    ProductDetail detail(Long id);

    List<ProductDetail> getDetail(Long id);

    MessageUtil delete(Long id);

    MessageUtil update(List<Long> ids, List<Integer> quantitys, List<BigDecimal> prices);

}
