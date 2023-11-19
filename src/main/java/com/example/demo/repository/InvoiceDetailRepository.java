package com.example.demo.repository;

import com.example.demo.dto.InvoiceDetailDto;
import com.example.demo.entity.InvoiceDetail;
import com.example.demo.entity.composite.InvoiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail, InvoiceId> {
    @Query("select new com.example.demo.dto.InvoiceDetailDto(c) from InvoiceDetail c where c.invoiceId.invoice.codeBill =:codeBill")
    List<InvoiceDetailDto> getAllInvoi(String codeBill);
}
