package com.daagas.inditex.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.daagas.inditex.model.Product;

public interface InditexProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT * FROM Product WHERE ? BETWEEN START_DATE AND END_DATE AND PRODUCT_ID = ? AND BRAND_ID = ? ORDER BY PRIORITY DESC")
    Product findByConditions(LocalDateTime localDateTime, Integer productId, Integer brandId);
}