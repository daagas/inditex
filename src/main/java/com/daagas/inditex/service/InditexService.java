package com.daagas.inditex.service;

import java.time.LocalDateTime;

import com.daagas.inditex.model.Product;

public interface InditexService {
    Product getProduct(LocalDateTime applicationDate, Integer idProduct, Integer brandId);
}
