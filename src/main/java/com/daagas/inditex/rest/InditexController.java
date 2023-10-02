package com.daagas.inditex.rest;

import com.daagas.inditex.Exceptions.InvalidRequestException;
import com.daagas.inditex.Exceptions.ResourceNotFoundException;
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

        if (product.getProductId() == null || product.getBrandId() == null) {
            throw new InvalidRequestException("Los parámetros productId y brandId son obligatorios.");
        }

        Product responseProduct = new Product();

        try {
            responseProduct = inditexService.getProduct(product.getDate(),
                product.getProductId(),
                product.getBrandId());
        } catch (Exception e) {
            throw new RuntimeException("Ocurrió un error interno en el servidor", e);
        }
        

        if (responseProduct == null) {
            throw new ResourceNotFoundException("Producto no encontrado para productId: " + product.getProductId() + " y brandId: " + product.getBrandId());
        }

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