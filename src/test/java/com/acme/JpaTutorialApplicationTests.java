package com.acme;

import java.awt.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acme.order.customer.Customer;
import com.acme.order.customer.CustomerRepository;
import com.acme.order.customer.CustomerType;
import com.acme.order.customer.CustomerTypeRepository;
import com.acme.order.pizza.OrderRepository;
import com.acme.order.pizza.PizzaOrder;
import com.acme.order.pizza.PizzaOrderService;
import com.acme.order.pizza.PizzaType;
import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JpaTutorialApplication.class)
public class JpaTutorialApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private PizzaOrderService pizzaOrderService;
	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CustomerTypeRepository customerTypeRepository;
	
	
	@Test
	public void contextLoads() {
//		Customer customer1 = new Customer(null, "John Smith", "john@smith.com", "Lodz, Jaracza 74");
//		Customer customer2 = new Customer(null, "Jan Kowalski", "jan@kowalski.pl", "Lodz, Piotrkowska 100");
//		
//		customerRepository.save(customer1);
//		
//		
//
//		String orderId1 = orderService.createOrder(customer1, PizzaType.LARGE);
//		String orderId2 = orderService.createOrder(customer2, PizzaType.SMALL);
//
//		
//		
//		log.info("Unprocessed orders:{}", orderService.fetchUnprocessed());
//		log.info("Delivered orders:{}", orderService.fetchDelivered());
//
//		orderService.deliverOrder(orderId1);
//		log.info("Delivered orders:{}", orderService.fetchDelivered());
//		orderService.cancelOrder(orderId2);
//		log.info("Delivered orders:{}", orderService.fetchDelivered());
//		log.info("Cancelled orders:{}", orderService.fetchCancelled());
//		log.info("Unprocessed orders:{}", orderService.fetchUnprocessed());
		
		
	}
	
	@Test
	public void dataLoads(){
		
		CustomerType cType1 = new CustomerType();
		cType1.setName("Indywidualny");
		
		CustomerType cType2 = new CustomerType();
		cType2.setName("Inny");
		
		customerTypeRepository.save(Lists.newArrayList(cType1,cType2));
		
		
		Customer customer1 = new Customer(null, "John Smith", "john@smith.com", "Lodz, Jaracza 74",cType1);
		Customer customer2 = new Customer(null, "Jan Kowalski", "jan@kowalski.pl", "Lodz, Piotrkowska 100",cType2);
		
		customerRepository.save(Lists.newArrayList(customer1,customer2));
		PizzaOrder pizzaOrder1 = new PizzaOrder(customer1, PizzaType.LARGE);
		PizzaOrder pizzaOrder2 = new PizzaOrder(customer2, PizzaType.BIG);
		
		
		orderRepository.save(Lists.newArrayList(pizzaOrder1,pizzaOrder2));
	}
	
//	@Test 
//	public void saveOrder(){
//		Customer customer1 = new Customer(null, "John Smith", "john@smith.com", "Lodz, Jaracza 74");
//		Customer customer2 = new Customer(null, "Jan Kowalski", "jan@kowalski.pl", "Lodz, Piotrkowska 100");
//		
////		Long orderId1 = pizzaOrderService.createOrder(customer1, PizzaType.LARGE);
////		Long orderId2 = pizzaOrderService.createOrder(customer2, PizzaType.SMALL);
////		
//		PizzaOrder pizzaOrder1 = new PizzaOrder(customer1, PizzaType.LARGE);
//		PizzaOrder pizzaOrder2 = new PizzaOrder(customer2, PizzaType.BIG);
//		
//		
//		orderRepository.save(Lists.newArrayList(pizzaOrder1,pizzaOrder2));
//	}
	
	

}
