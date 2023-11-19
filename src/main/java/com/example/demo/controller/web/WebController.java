package com.example.demo.controller.web;

import com.example.demo.service.BrandService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {

    @Autowired
    private ProductService productService;
    @Autowired
    private BrandService brandService;
//    @Autowired
//    private

    @GetMapping()
    public String homeLocal(Model model){
        model.addAttribute("topProducts", productService.getAll("0",null,null,null));
        model.addAttribute("brands", brandService.getAll());
        return "web/index";
    }
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("topProducts", productService.getAll("0",null,null,null));
        model.addAttribute("brands", brandService.getAll());
        return "web/index";
    }
}
