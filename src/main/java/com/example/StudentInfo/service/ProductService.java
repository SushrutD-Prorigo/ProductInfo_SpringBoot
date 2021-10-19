package com.example.StudentInfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentInfo.entity.Product;
import com.example.StudentInfo.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product); 
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product Removed "+id;
	}
	
	public Product updateProduct(Product product) {
		Product existing = repository.findById(product.getId()).orElse(null);
		existing.setName(product.getName());
		existing.setId(product.getId());
		existing.setQuantity(product.getQuantity());
		return repository.save(existing);
		
	}
}
