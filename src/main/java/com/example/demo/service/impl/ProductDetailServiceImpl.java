package com.example.demo.service.impl;

import com.example.demo.entity.ProductDetail;
import com.example.demo.repository.ProductDetailRepository;
import com.example.demo.service.ProductDetailService;
import com.example.demo.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    @Autowired
    ProductDetailRepository productDetailRepository;

    @Override
    public void add(ProductDetail product) {
        productDetailRepository.save(product);

    }

    @Override
    public ProductDetail detail(Long id) {
        return null;
    }

    @Override
    public List<ProductDetail> getDetail(Long id) {
        return productDetailRepository.getDetailProduct(id);
    }

    @Override
    public MessageUtil delete(Long id) {
        if (productDetailRepository.existsById(id)) {
            productDetailRepository.deleteById(id);
            return MessageUtil.builder().status(1).message("Xóa thành công !").type("bg-success").build();
        } else {
            return MessageUtil.builder().status(0).message("Xóa thất bại !").type("bg-danger").build();
        }
    }

    @Override
    public MessageUtil update(List<Long> ids, List<Integer> quantitys, List<BigDecimal> prices) {
        ProductDetail detail = new ProductDetail();
        try {
            for (int i = 0; i < ids.size(); i++) {
                detail = productDetailRepository.getReferenceById(ids.get(i));
                detail.setQuantity(quantitys.get(i));
                detail.setPrice(prices.get(i));
                detail.setStatus("on");
                productDetailRepository.save(detail);
            }
            return MessageUtil.builder().status(1).message("Thành công !").type("bg-success").build();
        } catch (Exception e) {
            return MessageUtil.builder().status(0).message("Thất bại !").type("bg-danger").build();
        }

    }
}
