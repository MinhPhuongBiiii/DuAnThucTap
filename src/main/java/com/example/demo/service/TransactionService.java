package com.example.demo.service;


import com.example.demo.dto.TransactionDto;

import java.util.List;

public interface TransactionService {
    List<TransactionDto> getAll(String codeBill);
}
