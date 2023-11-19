package com.example.demo.controller.admin;

import com.example.demo.entity.Brand;
import com.example.demo.service.BrandService;
import com.example.demo.util.MessageUtil;
import com.example.demo.util.UserUltil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("admin")
public class BrandController {
    @Autowired
    private BrandService service;

    @GetMapping("brand")
    public String hienthi(Model model) {
        model.addAttribute("list", service.getAll());
        model.addAttribute("object", new Brand());
        return "admin/brand";
    }

    @GetMapping("brand/{id}")
    public String detail(Model model, @PathVariable("id") Long id) {
        model.addAttribute("list", service.getAll());
        model.addAttribute("object", service.detail(id));
        return "admin/brand";
    }

    @PostMapping("brand/save")
    public String save(RedirectAttributes attributes, @ModelAttribute("object") Brand brand) throws IOException {
        MessageUtil messageUtil = service.save(brand);
        attributes.addFlashAttribute("message", messageUtil);
        return "redirect:/admin/brand";
    }

    @ModelAttribute("message")
    public MessageUtil initMessage() {
        return new MessageUtil();
    }

    @ModelAttribute("user")
    public Object initUser() {
        return UserUltil.getUser();
    }

}
