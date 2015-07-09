package com.acme.order.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByCustomerTypeName(String name);
	
	@Query("select u from Customer u where u.id = ?1")
	Customer findIndividual(Long id);
}
