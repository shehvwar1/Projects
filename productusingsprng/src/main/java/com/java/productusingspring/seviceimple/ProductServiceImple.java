package com.java.productusingspring.seviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.productusingspring.entity.Product;
import com.java.productusingspring.repository.ProductRepository;
import com.java.productusingspring.service.ProductService;

@Service
public class ProductServiceImple implements ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public Product insertRecord(Product product) {
		return productRepository.save(product);
	}

	
	public void deleteRecord(Product product, int productId) {
	
		productRepository.deleteById(productId);
	}

}
