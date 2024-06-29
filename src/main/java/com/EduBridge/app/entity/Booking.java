package com.EduBridge.app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
	public class Booking {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @ManyToOne
	    @JoinColumn(name = "product_id")
	    private Product product;
	    
	    private LocalDateTime bookingTime;
	    
	    public Booking(Long id, Product product, LocalDateTime bookingTime) {
			super();
			this.id = id;
			this.product = product;
			this.bookingTime = bookingTime;
		}

		public Booking() {
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public LocalDateTime getBookingTime() {
			return bookingTime;
		}

		public void setBookingTime(LocalDateTime bookingTime) {
			this.bookingTime = bookingTime;
		}

		@Override
		public String toString() {
			return "Booking [id=" + id + ", product=" + product + ", bookingTime=" + bookingTime + ", getId()="
					+ getId() + ", getProduct()=" + getProduct() + ", getBookingTime()=" + getBookingTime()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		
	    // other fields and getters/setters
	}



