package com.example.demo.dto;

import com.example.demo.entity.Address;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserRequest {

    private Long id;
    private String province;//tỉnh/thành phố
    private String district;//huyện
    private String ward;//xã/phường
    private String street;//đường/số nhà/ngõ

    private String name;
    private Boolean gender;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;
    private String avatar;
    private  String status;
    private List<Role> roles;


    public Address address() {
        Address address = Address.builder()

                .province(this.province)
                .district(this.district)
                .ward(this.ward)
                .street(this.street)
                .build();
        return address;
    }

    public User user(){
        User user = User.builder()
                .name(this.name)
                .gender(this.gender)
                .phoneNumber(this.phoneNumber)
                .email(this.email)
                .avatar(this.avatar)
                .status(this.status)
                .build();
        return user;

    }




    public UserRequest(Address x){
        this.id = x.getId();
        this.province= x.getProvince();
        this.district = x.getDistrict();
        this.ward = x.getWard();
        this.street=x.getStreet();
        this.name = x.getUser().getName();
        this.gender = x.getUser().getGender();
        this.phoneNumber = x.getUser().getPhoneNumber();
        this.email = x.getUser().getEmail();
        this.username = x.getUser().getUsername();
        this.password = x.getUser().getPassword();
        this.avatar = x.getUser().getAvatar();
    }


}
