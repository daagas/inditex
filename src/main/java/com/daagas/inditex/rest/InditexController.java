package com.daagas.inditex.rest;

import com.daagas.inditex.model.Product;
import com.daagas.inditex.model.ProductRequest;
import com.daagas.inditex.model.ProductResponse;
import com.daagas.inditex.service.InditexService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class InditexController {

    private final InditexService inditexService;

    public InditexController(InditexService inditexService) {
        this.inditexService = inditexService;
    }

    @GetMapping("/getProduct")
    public ResponseEntity<ProductResponse> getProduct(
            @RequestBody ProductRequest product
    ) {

        Product responseProduct = inditexService.getProduct(product.getDate(),
                product.getProductId(),
                product.getBrandId());

        ProductResponse response = new ProductResponse(
                responseProduct.getProductId(),
                responseProduct.getBrandId(),
                responseProduct.getPriceList(),
                responseProduct.getStartDate(),
                responseProduct.getEndDate(),
                responseProduct.getPrice()
        );

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}