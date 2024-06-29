package com.EduBridge.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EduBridge.app.entity.Product;


	public interface ProductRepository extends JpaRepository<Product,Integer> {

		Optional<Product> findById(Long productId);

//	Product save(Product product);

	

}
