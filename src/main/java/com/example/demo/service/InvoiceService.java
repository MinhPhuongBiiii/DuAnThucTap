package com.example.demo.service;


import com.example.demo.dto.InvoiceDto;
import com.example.demo.entity.Invoice;

import java.util.List;

public interface InvoiceService {
    List<Invoice> getAll();
    List<Invoice> getStatus(String status);
    InvoiceDto detail(String codeBill);

}
