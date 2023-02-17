package com.example.demo2;

import com.example.demo2.entity.Product;
import com.example.demo2.repository.ProductReposiory;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RequiredArgsConstructor
@SpringBootApplication
public class Demo2Application implements CommandLineRunner {
    private final ProductReposiory reposiory;

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Override
    public void run(String... args){
        Product product1 = Product.builder().name("name1").price(1L).build();
        reposiory.save(product1);
        Product product2 = Product.builder().name("name1").price(1L).build();
        reposiory.save(product2);
        Product product3 = Product.builder().name("name1").price(1L).build();
        reposiory.save(product3);
        Product product4 = Product.builder().name("name1").price(1L).build();
        reposiory.save(product4);

    }
}
