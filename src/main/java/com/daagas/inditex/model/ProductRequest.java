package com.daagas.inditex.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ProductRequest {

    private Integer brandId;

    private LocalDateTime date;

    private Integer productId;
}
