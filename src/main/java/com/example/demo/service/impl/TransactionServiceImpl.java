package com.example.demo.service.impl;


import com.example.demo.dto.TransactionDto;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private TransactionRepository repository;

    @Override
    public List<TransactionDto> getAll(String codeBill) {
        return repository.getAll(codeBill);
    }
}
