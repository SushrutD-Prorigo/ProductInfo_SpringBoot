package com.example.StudentInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentInfo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
