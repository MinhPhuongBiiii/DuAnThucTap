package com.example.demo.service;


import com.example.demo.dto.PromotionDto;
import com.example.demo.util.MessageUtil;

public interface PromotionService {

    MessageUtil add(PromotionDto dto);

    MessageUtil update(PromotionDto dto,Long id);

    Object getAll(String status);

    void jobUpdate();

    Object detail(Long id);
}
