package com.example.demo.service.impl;

import com.example.demo.dto.InvoiceDto;
import com.example.demo.entity.Invoice;
import com.example.demo.entity.User;
import com.example.demo.repository.InvoiceDetailRepository;
import com.example.demo.repository.InvoiceRepository;
import com.example.demo.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceRepository repository;

    @Autowired
    private InvoiceDetailRepository detailRepository;

    @Override
    public List<Invoice> getAll() {
        List<Invoice> list = repository.getAll();
        list.stream().forEach(x ->{
            if (x.getUser() == null){
                x.setUser(User.builder().name("Khách lẻ").build());
            }
        });
        return list;
    }

    @Override
    public List<Invoice> getStatus(String status) {
        List<Invoice> list =  repository.getStatus(status);
        list.stream().forEach(x ->{
            if (x.getUser() == null){
                x.setUser(User.builder().name("Khách lẻ").build());
            }
        });
        return list;



    }

    @Override
    public InvoiceDto detail(String codeBill) {
        InvoiceDto invoiceDto = new InvoiceDto(repository.getReferenceById(codeBill));
        invoiceDto.setProduct(detailRepository.getAllInvoi(codeBill));
        return invoiceDto;
    }

}
