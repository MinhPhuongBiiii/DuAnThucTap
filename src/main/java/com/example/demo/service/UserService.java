package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserRequest;
import com.example.demo.entity.Address;
import com.example.demo.entity.User;
import com.example.demo.request.UserSignUpRequest;
import com.example.demo.request.forgot_passwort.UserForgotPasswordRequest;
import com.example.demo.util.MessageUtil;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

import org.springframework.core.convert.converter.Converter;

public interface UserService extends Converter<UserSignUpRequest, User>
        , UserDetailsService{
    List<User> getAll();

    void add(User user);

    Optional<User> detail(Long id);

    Optional<User> getById(Long id);

    Optional<User> getByUserName(String userName);



    boolean isEmailExists(String email);


    Optional<User> changePassword(UserForgotPasswordRequest userForgotPasswordRequest);

    List<UserDto> getAll(String status);

    User detailCustomer(Long id);

    MessageUtil add(UserRequest userRequest, MultipartFile file);

    List<Address> findByIdDiaChi(Long cid);

}


