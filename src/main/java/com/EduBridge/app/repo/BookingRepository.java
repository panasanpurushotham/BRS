package com.EduBridge.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EduBridge.app.entity.Booking;
import com.EduBridge.app.entity.Product;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	    List<Booking> findByProduct(Product product);
	}


