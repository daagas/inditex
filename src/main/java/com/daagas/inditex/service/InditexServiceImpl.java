package com.daagas.inditex.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import com.daagas.inditex.model.Product;
import com.daagas.inditex.repository.InditexProductRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InditexServiceImpl implements InditexService {

    private final InditexProductRepository inditexProductRepository;

    @Override
    public Product getProduct(LocalDateTime applicationDate, Integer idProduct, Integer brandId) {
        return inditexProductRepository.findByConditions(applicationDate, idProduct, brandId);
    }
}

