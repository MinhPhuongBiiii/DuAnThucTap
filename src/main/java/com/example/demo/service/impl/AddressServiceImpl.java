package com.example.demo.service.impl;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Override
    public void add(Address address) {
        addressRepository.save(address);
    }
}
