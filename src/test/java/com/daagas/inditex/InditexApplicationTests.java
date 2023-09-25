package com.daagas.inditex;


import com.daagas.inditex.rest.InditexController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.daagas.inditex.model.Product;
import com.daagas.inditex.model.ProductRequest;
import com.daagas.inditex.model.ProductResponse;
import com.daagas.inditex.service.InditexService;

@SpringBootTest
class InditexApplicationTests {

	@Mock
    private InditexService inditexService;

    @InjectMocks
    private InditexController inditexController;

    @BeforeEach
    void setUp() {
        
    }

    @Test
    void test1() {
        // Mock de la respuesta del servicio
        Integer productId = 35455;
        Integer brandId = 1;
        LocalDateTime date = LocalDateTime.of(2023, 5, 14, 10, 0); // 2023-05-14 10:00:00

        //Objeto esperado a devolver
        LocalDateTime startDate1 = LocalDateTime.of(2020, 6, 14, 0, 0, 0);
        LocalDateTime endDate1 = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        ProductResponse productResponseO = new ProductResponse(35455, 1, 1, startDate1, endDate1, 35.50f);

        Product product = new Product();
        product.setProductId(productId);
        product.setBrandId(brandId);
        // Establece los demás atributos del producto según tu modelo

        when(inditexService.getProduct(date, productId, brandId)).thenReturn(product);

        // Ejecución del endpoint
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductId(productId);
        productRequest.setBrandId(brandId);
        productRequest.setDate(date);

        ResponseEntity<ProductResponse> response = inditexController.getProduct(productRequest);

        // Verificación de la respuesta
        assertEquals(HttpStatus.OK, response.getStatusCode());

        ProductResponse productResponse = response.getBody();
        assertEquals(productResponseO, productResponse);
	}

    @Test
    void test2() {
        // Mock de la respuesta del servicio
        Integer productId = 35455;
        Integer brandId = 1;
        LocalDateTime date = LocalDateTime.of(2023, 6, 14, 10, 0); // 2023-05-14 10:00:00

        //Objeto que debería devolver
        LocalDateTime startDate1 = LocalDateTime.of(2020, 6, 14, 0, 0, 0);
        LocalDateTime endDate1 = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        ProductResponse productResponseO = new ProductResponse(35455, 1, 1, startDate1, endDate1, 35.50f);

        Product product = new Product();
        product.setProductId(productId);
        product.setBrandId(brandId);
        // Establece los demás atributos del producto según tu modelo

        when(inditexService.getProduct(date, productId, brandId)).thenReturn(product);

        // Ejecución del endpoint
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductId(productId);
        productRequest.setBrandId(brandId);
        productRequest.setDate(date);

        ResponseEntity<ProductResponse> response = inditexController.getProduct(productRequest);

        // Verificación de la respuesta
        assertEquals(HttpStatus.OK, response.getStatusCode());

        ProductResponse productResponse = response.getBody();
        assertEquals(productResponseO, productResponse);
	}

    @Test
    void test3() {
        // Mock de la respuesta del servicio
        Integer productId = 35455;
        Integer brandId = 1;
        LocalDateTime date = LocalDateTime.of(2023, 5, 14, 10, 0); // 2023-05-14 10:00:00

        //Objeto esperado a devolver
        LocalDateTime startDate3 = LocalDateTime.of(2020, 6, 14, 0, 0, 0);
        LocalDateTime endDate3 = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        ProductResponse productResponseO = new ProductResponse(35455, 1, 1, startDate3, endDate3, 35.50f);

        Product product = new Product();
        product.setProductId(productId);
        product.setBrandId(brandId);
        // Establece los demás atributos del producto según tu modelo

        when(inditexService.getProduct(date, productId, brandId)).thenReturn(product);

        // Ejecución del endpoint
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductId(productId);
        productRequest.setBrandId(brandId);
        productRequest.setDate(date);

        ResponseEntity<ProductResponse> response = inditexController.getProduct(productRequest);

        // Verificación de la respuesta
        assertEquals(HttpStatus.OK, response.getStatusCode());

        ProductResponse productResponse = response.getBody();
        assertEquals(productResponseO, productResponse);
	}

    @Test
    void test4() {
        // Mock de la respuesta del servicio
        Integer productId = 35455;
        Integer brandId = 1;
        LocalDateTime date = LocalDateTime.of(2023, 5, 14, 10, 0); // 2023-05-14 10:00:00

        //Objeto esperado a devolver
        LocalDateTime startDate4 = LocalDateTime.of(2020, 6, 15, 0, 0, 0);
        LocalDateTime endDate4 = LocalDateTime.of(2020, 6, 15, 11, 0, 0);
        ProductResponse productResponseO = new ProductResponse(35455, 1, 3, startDate4, endDate4, 30.50f);

        Product product = new Product();
        product.setProductId(productId);
        product.setBrandId(brandId);
        // Establece los demás atributos del producto según tu modelo

        when(inditexService.getProduct(date, productId, brandId)).thenReturn(product);

        // Ejecución del endpoint
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductId(productId);
        productRequest.setBrandId(brandId);
        productRequest.setDate(date);

        ResponseEntity<ProductResponse> response = inditexController.getProduct(productRequest);

        // Verificación de la respuesta
        assertEquals(HttpStatus.OK, response.getStatusCode());

        ProductResponse productResponse = response.getBody();
        assertEquals(productResponseO, productResponse);
	}

    @Test
    void test5() {
        // Mock de la respuesta del servicio
        Integer productId = 35455;
        Integer brandId = 1;
        LocalDateTime date = LocalDateTime.of(2023, 5, 14, 10, 0); // 2023-05-14 10:00:00

        //Objeto esperado a devolver
        LocalDateTime startDate5 = LocalDateTime.of(2020, 6, 15, 16, 0, 0);
        LocalDateTime endDate5 = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        ProductResponse productResponseO = new ProductResponse(35455, 1, 4, startDate5, endDate5, 38.95f);

        Product product = new Product();
        product.setProductId(productId);
        product.setBrandId(brandId);
        // Establece los demás atributos del producto según tu modelo

        when(inditexService.getProduct(date, productId, brandId)).thenReturn(product);

        // Ejecución del endpoint
        ProductRequest productRequest = new ProductRequest();
        productRequest.setProductId(productId);
        productRequest.setBrandId(brandId);
        productRequest.setDate(date);

        ResponseEntity<ProductResponse> response = inditexController.getProduct(productRequest);

        // Verificación de la respuesta
        assertEquals(HttpStatus.OK, response.getStatusCode());

        ProductResponse productResponse = response.getBody();
        assertEquals(productResponseO, productResponse);
	}

}
