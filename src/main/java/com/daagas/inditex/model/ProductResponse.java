package com.daagas.inditex.model;

import java.time.LocalDateTime;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductResponse {

    private Integer productId;

    private Integer brandId;

    private Integer priceList;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private float price;

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) result = true;
        if (o == null || getClass() != o.getClass()) result = false;
        ProductResponse that = (ProductResponse) o;
        result = Float.compare(that.price, price) == 0 &&
                Objects.equals(productId, that.productId) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(priceList, that.priceList) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate);
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, brandId, priceList, startDate, endDate, price);
    }

}
