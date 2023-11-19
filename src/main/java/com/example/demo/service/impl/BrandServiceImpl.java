package com.example.demo.service.impl;

import com.example.demo.entity.Brand;
import com.example.demo.repository.BrandRepository;
import com.example.demo.service.BrandService;
import com.example.demo.service.ImageService;
import com.example.demo.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandRepository brandRepository;
    @Autowired
    private ImageService imageService;

    @Override
    public Brand detail(Long id) {
        return brandRepository.getReferenceById(id);
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }

    @Override
    public MessageUtil save(Brand brand) {
        if (brandRepository.existsByName(brand.getName())){
            return MessageUtil.builder().status(0).message("Thêm thất bại vì tên thương hiệu đã có !").type("bg-danger").build();
        }else {
            brandRepository.save(brand);
            return MessageUtil.builder().status(1).message("Thêm thành công !").type("bg-success").build();
        }

    }

}
