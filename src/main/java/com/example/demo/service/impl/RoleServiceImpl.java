package com.example.demo.service.impl;


import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public List<Role> getAll(Integer pageIndex, Integer pageSize) {
        return roleRepository.findAll(PageRequest.of(pageIndex, pageSize)).stream().toList();
    }

    @Override
    public void add(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Optional<Role> detail(Integer id) {
        return roleRepository.findById(id);
    }

}
