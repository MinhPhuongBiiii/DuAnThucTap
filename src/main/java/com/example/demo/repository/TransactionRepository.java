package com.example.demo.repository;

import com.example.demo.dto.TransactionDto;
import com.example.demo.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("select new com.example.demo.dto.TransactionDto (c)from Transaction c where c.invoice.codeBill = :codeBill order by c.id asc")
    List<TransactionDto> getAll(String codeBill);

}
