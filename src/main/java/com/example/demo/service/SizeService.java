package com.example.demo.service;


import com.example.demo.entity.Size;
import com.example.demo.util.MessageUtil;

import java.util.List;

public interface SizeService {

    List<Size> getAll();

    Size detail(Integer id);

    MessageUtil save(Size size);
}
