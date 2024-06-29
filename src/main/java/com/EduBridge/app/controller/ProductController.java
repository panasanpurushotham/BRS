package com.EduBridge.app.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EduBridge.app.entity.Booking;
import com.EduBridge.app.entity.Product;
import com.EduBridge.app.repo.BookingRepository;
import com.EduBridge.app.repo.ProductRepository;

@RestController
	@RequestMapping("/api/products")
	public class ProductController {
	    @Autowired
	    private ProductRepository productRepository;
	    
	    @Autowired
        private BookingRepository bookingRepository;
	    
	    // ...existing endpoints...

	    @PostMapping
	    public Product addProduct(@RequestBody Product product) {
	        return productRepository.save(product);
	    }
	    @GetMapping
	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }
	    
	        // ...existing endpoints...

	        @PostMapping("/book/{productId}")
	        public ResponseEntity<String> bookProduct(@PathVariable Long productId) {
	            Optional<Product> optionalProduct = productRepository.findById(productId);
	            if (optionalProduct.isEmpty()) {
	                return ResponseEntity.notFound().build();
	            }
	            
	            Product product = optionalProduct.get();
	            Booking booking = new Booking();
	            booking.setProduct(product);
	            booking.setBookingTime(LocalDateTime.now());
	            bookingRepository.save(booking);
	            
	            return ResponseEntity.ok("Product booked successfully.");
	        }
	    }

	    
	



