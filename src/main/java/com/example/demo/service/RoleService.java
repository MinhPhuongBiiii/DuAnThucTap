package com.example.demo.service;


import com.example.demo.entity.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    List<Role> getAll();

    /**
     *
     * @param pageIndex trang muốn lấy
     * @param pageSize số phần tử của 1
     * @return
     */
    List<Role> getAll(Integer pageIndex,Integer pageSize);
    void add(Role role);

     Optional<Role> detail(Integer id);


}
