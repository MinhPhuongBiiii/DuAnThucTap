package com.example.demo.repository;

import com.example.demo.dto.PromotionDto;
import com.example.demo.entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
    Promotion getById(Long id);

    @Query("select new com.example.demo.dto.PromotionDto(c) from Promotion c order by c.id desc ")
    List<PromotionDto> findAllDto();

    @Query("select new com.example.demo.dto.PromotionDto(c) from Promotion c where c.status = :status order by c.id desc ")
    List<PromotionDto> findAllDto(String status);

    @Query("select c from Promotion c where c.status in ('1','0')")
    List<Promotion> getAllJop();

    Boolean existsByGiftCodeOrDiscountName(String giftCode, String name);
}
