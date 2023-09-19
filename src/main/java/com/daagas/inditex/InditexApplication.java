package com.daagas.inditex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.daagas.inditex.model.Product")
@ComponentScan("com.daagas.inditex.repository")
@EnableJpaRepositories("com.daagas.inditex.repository.InditexProductRepository")
public class InditexApplication {

  public static void main(String[] args) {
    SpringApplication.run(InditexApplication.class, args);
  }

}
