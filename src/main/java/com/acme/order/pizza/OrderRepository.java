package com.acme.order.pizza;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acme.order.OrderStatus;

@Repository
public interface OrderRepository extends JpaRepository<PizzaOrder, Long> {
	List<PizzaOrder> findByStatus(OrderStatus delivered);
}
