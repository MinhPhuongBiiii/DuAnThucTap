package com.example.demo.service.impl;

import com.example.demo.entity.Color;
import com.example.demo.repository.ColorRepository;
import com.example.demo.service.ColorService;
import com.example.demo.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    ColorRepository colorRepository;


    @Override
    public Color detail(Integer id) {
        return colorRepository.getReferenceById(id);
    }

    @Override
    public List<Color> getAll() {
        return colorRepository.getAll();
    }

    @Override
    public MessageUtil save(Color color) {
        if (colorRepository.existsByName(color.getName())) {
            return MessageUtil.builder().status(0).message("Thêm thất bại vì màu sắc đã có !").type("bg-danger").build();
        } else {
            colorRepository.save(color);
            return MessageUtil.builder().status(1).message("Thêm thành công !").type("bg-success").build();
        }

    }


}
