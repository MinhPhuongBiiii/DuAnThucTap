package com.example.demo.controller.admin;

import com.example.demo.util.UserUltil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class PosBanHangController {
    @GetMapping("/sale")
    public String sale(Model model){

        return "admin/banhang";
    }

    @ModelAttribute("user")
    public Object initUser(){
        return UserUltil.getUser();
    }
}
