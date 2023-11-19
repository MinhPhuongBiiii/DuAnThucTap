package com.example.demo.repository;

import com.example.demo.entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepository extends JpaRepository<Description,Long> {
    Description getById(Long id);
}
