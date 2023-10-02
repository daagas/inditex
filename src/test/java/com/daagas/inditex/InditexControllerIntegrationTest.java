package com.daagas.inditex;

import com.daagas.inditex.model.ProductRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(classes = InditexApplication.class)
@AutoConfigureMockMvc
public class InditexControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetProduct() throws Exception {
        // Crear un objeto ProductRequest con los parámetros necesarios
        ProductRequest productRequest = new ProductRequest();
        productRequest.setBrandId(1);
        productRequest.setProductId(35455);
        // Configurar el objeto ProductRequest como un JSON
        String requestBody = objectMapper.writeValueAsString(productRequest);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/products/getProduct")
                .param("brandId", "1")
                .param("productId", "35455")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.productId").value(35455))
                .andExpect(MockMvcResultMatchers.jsonPath("$.brandId").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(35.50));
    }
}

