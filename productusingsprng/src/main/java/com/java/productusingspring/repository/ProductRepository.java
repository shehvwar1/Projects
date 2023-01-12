package com.java.productusingspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.productusingspring.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
