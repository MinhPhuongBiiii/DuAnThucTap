package com.example.demo.repository;

import com.example.demo.entity.TypeProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeProductRepository extends JpaRepository<TypeProduct, Long> {
    Boolean existsByName(String name);

    @Query("select c from Brand c order by c.id desc ")
    List<TypeProduct> getAll();
}
