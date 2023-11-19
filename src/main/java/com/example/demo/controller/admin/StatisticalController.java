package com.example.demo.controller.admin;

import com.example.demo.util.UserUltil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class StatisticalController {

    @GetMapping("/thong-ke")
    public String hienThi(Model model){
        model.addAttribute("user", UserUltil.getUser());
        return "admin/thongke";
    }

}
