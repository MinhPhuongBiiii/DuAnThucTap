package com.example.demo.service;


import com.example.demo.entity.Color;
import com.example.demo.util.MessageUtil;

import java.util.List;

public interface ColorService {

    Color detail(Integer id);

    List<Color> getAll();

    MessageUtil save(Color color);

}
