package com.example.demo.util;



import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserUltil {
    @Autowired
    private static UserService userService;

    public static User getUser(){

        return  User.builder().name("Nguyen Thi Minh Phuong").avatar("https://res.cloudinary.com/dg8hhxkah/image/upload/v1698080470/avartar/vedidtoxs2wn2khvtekq.jpg").build();
    }
}
