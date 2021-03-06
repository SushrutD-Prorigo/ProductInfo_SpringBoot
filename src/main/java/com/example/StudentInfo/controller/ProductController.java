
package com.example.StudentInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentInfo.entity.Product;
import com.example.StudentInfo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product ) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProduct(@RequestBody List<Product> products ) {
		return service.saveProducts(products);
	}
	
	@GetMapping("/Products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/ProductById/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product ) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
